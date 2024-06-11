# Overview
This is a device price classification system that uses Python and SpringBoot. Mainly the system includes two small projects:
- **Python project**: Allows you to predict the prices, allowing the sellers to classify the device's prices according to their characteristics.
- **SpringBoot project**: Contains a simple entity, and a few endpoints, to call the service from the Python project for a bunch of test cases, and store them.

The Python project analyzes the device's data and preprocesses and visualizes it to give a better understanding of the best ways for modeling it. The modeling was done inside the notebook in the `model` directory and the model is called inside a Flask API that takes an input device and outputs the price range from 0 to 3.

The SpringBoot project contains a simple H2 database with several operations such as adding and removing devices. It also calls the Flask API, which predicts input devices to the database. It contains the following endpoints:
- **GET /api/devices/**: Retrieve a list of all devices.
- **GET /api/devices/{id}**: Retrieve details of a specific device by ID.
- **POST /api/devices**: Add a new device.
- **POST /api/predict/{deviceId}**: Predicts the device price and inputs it into the device entity.

# Installation:
After cloning the project using the following snippet:

```sh
git clone https://github.com/AmrSheta22/Devices-Price-Classification-System.git
cd Devices-Price-Classification-System
```
You will need to install the system on your device by setting up two components:
<br/>
## First Component: Python Flask API:
First install the requirements for the project using: 
<br/>
```
pip install -r requirments.txt
```
Then you will run the flask API: 
```sh
cd flask_api
python api.py
```
## Second Component: SpringBoot backend:
After you have your API up and running you can now install the SpringBoot project:
<br/>
```sh
cd ../priceClassificationSystem
mvn clean install
mvn spring-boot:run
```
The system Now should be up and running!
<br/>
# Modelling and Testing:
The AdaBoost model used here achieves 93.5 percent validation accuracy and is tested on the test dataset inside the `data` folder. If you want to test the results of the model through the API, you can run the following code:
<br/>
```
cd flask_api
python testing.py
```
The output should be a list of the first ten records of the test set predicted. It should also output a file in the `data` folder called `test_predicted.csv` containing all the predicted test records.




