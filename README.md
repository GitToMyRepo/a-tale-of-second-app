* Build Docker Image
  ```
  PS C:\idev\simple-producer-app> docker build -t simple-producer-app .
  ```
* Build and run Docker Container
  ```
  PS C:\idev\simple-producer-app> docker run -p8081:8081 --name simple-producer-app-container --net producer-consumer-network simple-producer-app:latest
  ```
