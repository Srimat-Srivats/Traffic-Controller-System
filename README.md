# 🚦 Traffic Controller System

A Java-based desktop application that simulates traffic light control at multiple intersections using JavaFX and MySQL. It allows real-time visualization of traffic lights, simulates light changes, and logs events to a MySQL database.

---

## 📌 Overview

This project mimics the behavior of traffic lights at multiple intersections with real-time simulation. It uses:
- **JavaFX** to create a visual GUI for signal changes
- **MySQL** to store simulation data (logs)
- **JDBC** to connect Java with MySQL
- **JSP (planned)** for a future admin web dashboard

---

## 🧩 Technologies Used

- Java 17+
- JavaFX SDK
- MySQL (5.7/8.0)
- JDBC
- JSP (planned)

---

## 🔧 Folder Structure

TrafficControllerSystem/
├── main/ # Entry point
├── model/ # Core classes: TrafficLight, Intersection
├── controller/ # Simulation controller logic
├── view/ # JavaFX UI setup
├── db/ # Database connection utilities
├── sql/ # SQL script to create DB & table
└── README.md


---

## 🎮 Features

- 🟢 Automatic signal change for each intersection
- 🔁 Simulation of real-time traffic light behavior
- 📊 MySQL logging of signal states and timestamps
- ✨ Modular JavaFX-based UI
- 🌐 Scalable design for web and sensor integration

---

MIT License

Copyright (c) 2025 Srimat Srivats

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell    
copies of the Software, and to permit persons to whom the Software is         
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in   
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR   
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,     
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER       
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN    
THE SOFTWARE.

