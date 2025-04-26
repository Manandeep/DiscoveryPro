
#!/bin/bash

# Start Spring Boot backend
cd backend
./mvnw clean spring-boot:run &
BACK_PID=$!
cd ..

# Start Angular frontend
cd frontend/frontend
npm install
npx ng serve --host=0.0.0.0 --port=4200 --disable-host-check
FRONT_PID=$!

# Wait for both
wait $BACK_PID
wait $FRONT_PID
