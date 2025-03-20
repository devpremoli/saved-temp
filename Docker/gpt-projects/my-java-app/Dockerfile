# Step 1: Use an official OpenJDK image as the base image
FROM openjdk

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the current directory contents into the container at /app
COPY . /app

# Step 4: Compile the Java program
RUN javac HelloWorld.java

# Step 5: Run the Java program
CMD ["java", "HelloWorld"]
