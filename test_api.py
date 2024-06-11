import requests

# URL of the Flask API
url = 'http://127.0.0.1:5000/predict'

# JSON payload with the required keys
payload = {
    "battery_power": 842,
    "blue": 0,
    "clock_speed": 2.2,
    "dual_sim": 0,
    "fc": 1,
    "four_g": 0,
    "int_memory": 7,
    "m_dep": 0.6,
    "mobile_wt": 188,
    "n_cores": 2,
    "pc": 2,
    "px_height": 20,
    "px_width": 756,
    "ram": 2549,
    "sc_h": 9,
    "sc_w": 7,
    "talk_time": 19,
    "three_g": 0,
    "touch_screen": 0,
    "wifi": 1
}

# Send the POST request to the API
response = requests.post(url, json=payload)

# Print the response from the API
if response.status_code == 200:
    print('Prediction:', response.json()['prediction'])
else:
    print('Error:', response.json())
