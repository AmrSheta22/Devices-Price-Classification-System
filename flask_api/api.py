from flask import Flask, request, jsonify
import joblib
import numpy as np

app = Flask(__name__)

# Load the model
model = joblib.load('../model/adaboost_model.pkl')
scaler = joblib.load('../model/normalizer.pkl')

# Define the expected keys in the order the model expects them
expected_keys = [
    'battery_power', 'blue', 'clock_speed', 'dual_sim', 'fc', 'four_g',
    'int_memory', 'm_dep', 'mobile_wt', 'n_cores', 'pc', 'px_height',
    'px_width', 'ram', 'sc_h', 'sc_w', 'talk_time', 'three_g',
    'touch_screen', 'wifi'
]

@app.route('/predict', methods=['POST'])
def predict():
    try:
        data = request.get_json()
        if not all(key in data for key in expected_keys):
            return jsonify({'error': 'Invalid input data, some keys are missing'}), 400
        input_data = [data[key] for key in expected_keys]
        input_data = np.array(input_data).reshape(1, -1)
        input_data = scaler.transform(input_data)
        prediction = model.predict(input_data)
        print(prediction)
        return jsonify({'prediction': int(prediction[0])})
    except Exception as e:
        return jsonify({'error': str(e)}), 400

if __name__ == '__main__':
    app.run(debug=True)
