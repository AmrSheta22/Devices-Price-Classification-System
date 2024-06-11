package com.device_classifier.services;

import com.device_classifier.device.Device;
import com.device_classifier.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public Device getDeviceById(int id) {
        return deviceRepository.findById(id).orElse(null);
    }

    public Device addDevice(Device device) {
        return deviceRepository.save(device);
    }

    public String predict(int deviceId) {
        final String uri = "http://127.0.0.1:5000/predict";
        Device toBePredicted = getDeviceById(deviceId);
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.postForObject(uri, toBePredicted, String.class);
        ObjectMapper mapper = new ObjectMapper();
        try{
            JsonNode jsonNode = mapper.readTree(response);
            JsonNode predictionNode = jsonNode.path("prediction");
            String prediction = predictionNode.asText();
            int predictionNumber = Integer.parseInt(prediction);
            toBePredicted.setPrice_range(predictionNumber);
            deviceRepository.save(toBePredicted);
            return "Prediction result for device with ID: " + predictionNumber;
        } catch(Exception e){
            return "Error: " + e.getMessage();
        }

    }
}
