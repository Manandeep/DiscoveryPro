#!/bin/bash

# Start Spring Boot backend
cd backend
mvn clean spring-boot:run &
BACK_PID=$!
cd ..

# Start Angular frontend
cd frontend
npm install
npx ng serve --host=0.0.0.0 --port=4200
FRONT_PID=$!

# Wait for both
wait $BACK_PID
wait $FRONT_PID