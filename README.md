# Overview
This is a device price classification system that uses Python and SpringBoot. Mainly the system includes two small projects: <br/>
● Python project: allows you to predict the prices, allowing the sellers to classify the device's prices according to their characteristics <br/>
● SpringBoot project: contains a simple entity, and a few endpoints, to call the service  from the Python project for a bunch of test cases, and store them.

The Python project analyzes the devices data and preprocesses and visualize it to give a better understanding of the best ways for modelling it. The modelling was done inside the notebook inside the `modelling` directory and the model is called inside a flask API that takes an input device and outputs the price range from 0 to 3. <br/>
The SpringBoot project contains a simple h2 database with several operations such as adding and removing devices. It also calls the flask API to predict input devices to the database. It contains the following endpoints:<br/>
● POST /api/devices/: Retrieve a list of all devices <br/>
● GET /api/devices/{id}: Retrieve details of a specific device by ID. <br/>
● POST /api/devices: Add a new device. <br/>
● POST /api/predict/{deviceId}: Predicts the device price and inputs it into the device entity <br/>

# Installation:
After cloning the project using the following snippet:
<br/>
```
git clone https://github.com/AmrSheta22/Devices-Price-Classification-System.git
cd Devices-Price-Classification-System`
```
<br/>
You will need to install the system on your device by setting up two components:
## First Compnnent: Python Flask API:
First install the requirments for the project using: <br/>
```
pip install -r requirements.txt
```
<br/>
Then you will run the flask API: <br/>
```
cd flask_api
python api.py
```
## Second Component: SpringBoot backend:
After you have your API up and running you can now install the SpringBoot project:
<br/>
```
cd ../priceClassificationSystem
mvn clean install
mvn spring-boot:run
```
<br/>
The system Now should be up and running!

# Modelling and Testing:
The AdaBoost model used here achieves 93.5 percent validation accuracy and is tested on the test dataset inside the `data` folder. If you want to test the results of the model through the API, you can run the following code:
<br/>
```
cd flask_api
python testing.py
```
<br/>
The output should be a list of the first ten records of the test set predicted. It should also output a file in the `data` folder called `test_predicted.csv` which contains all the test records predicted.




