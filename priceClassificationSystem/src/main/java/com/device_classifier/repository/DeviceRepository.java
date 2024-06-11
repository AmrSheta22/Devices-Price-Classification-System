package com.device_classifier.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.device_classifier.device.Device;
//import org.springframework.stereotype.Repository;
public interface DeviceRepository extends JpaRepository<Device, Integer> {

}