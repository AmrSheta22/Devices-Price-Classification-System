# Overview
This is a device price classification system that uses Python and SpringBoot. Mainly
the system includes two small projects:
● Python project: allows you to predict the prices, allowing the sellers to classify the device's prices according to their characteristics
● SpringBoot project: contains a simple entity, and a few endpoints, to call the service
from the Python project for a bunch of test cases, and store them.

The Python project analyzes the devices data and preprocesses and visualize it to give a better understanding of the best ways for modelling it. The modelling was done inside the notebook inside the `modelling` directory and the model is called inside a flask API that takes an input device and outputs the price range from 0 to 3.
The SpringBoot project contains a simple h2 database with several operations such as adding and removing devices. It also calls the flask API to predict input devices to the database. It contains the following endpoints:
● POST /api/devices/: Retrieve a list of all devices
● GET /api/devices/{id}: Retrieve details of a specific device by ID.
● POST /api/devices: Add a new device.
● POST /api/predict/{deviceId}

# Installation:
After cloning the project using the following snippet:
`git clone https://github.com/AmrSheta22/Devices-Price-Classification-System.git
cd Devices-Price-Classification-System` 
You will need to install the system on your device by setting up two components:
## First Compnnent: Python Flask API:
First install the requirments for the project using:
`pip install -r requirements.txt`
Then you will run the flask api:
`cd flask_api
python api.py`
## Second Component: SpringBoot backend:
After you have your API up and running you can now install the SpringBoot project:
`cd ../priceClassificationSystem
mvn clean install
mvn spring-boot:run`
The system Now should be up and running!

# Modelling and Testing:
The AdaBoost model used here achieves 93.5 percent validation accuracy and is tested on the test dataset inside the `data` folder. If you want to test the results of the model through the API, you can run the following code:
`cd flask_api
python testing.py`
The output should be a list of the first ten records of the test set predicted. It should also output a file in the `data` folder called `test_predicted.csv` which contains all the test records predicted.




