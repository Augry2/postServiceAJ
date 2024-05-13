## Laboration 2: Chat Program Backend with Microservices

In lab 2, we will implement several microservices that together form the backend for a chat program. The focus is on configuring and running multiple microservices together effectively. This involves participating in the development of such a service as well as using others' services to create a functioning system. Microservices do not need to be written using Spring Boot but can be implemented using, for example, Quarkus, Micronaut, or perhaps another programming language other than Java.

Services from 2023 are available on repositories (github.com), and this is where you will also place your implementations together with CI/CD pipelines.

Develop one of the examples of microservices listed below. The microservice should be externally configurable and stateless (no session) to enable horizontal scaling. Any state should be stored in the associated database. The service should be available as a Docker image along with necessary documentation on how to run it.

During the last week of the course, demonstrate your own microservice and someone else's published service by starting them in Docker with docker-compose or in Kubernetes.

## Post Service (Stores messages with associated information)

The Post Service is responsible for storing messages along with their associated information. This service allows users to send and receive messages within the chat application.

#### Functionality:
- Store messages: The service should provide endpoints to store messages along with metadata such as sender, recipient, timestamp, etc.
- Retrieve messages: Users should be able to retrieve stored messages based on various criteria such as sender, recipient, time range, etc.

## API Reference:

using MongoDB

runs on port 8090

### Endpoints:
#### GET /messages
- This endpoint retrieves all messages from the database. It doesn't require any parameters.

    ```
    http://localhost:8090/messages
    ```
#### GET /messages/{id}
- This endpoint retrieves a single message by its ID. Replace {id} with the ID of the message you want to retrieve.  

    ```
    http://localhost:8090/messages/123
    ```
    
#### POST /messages

This endpoint facilitates the creation of a new message within the system. It requires a JSON body containing the message details and a userId header.

**Example:**
- **Request:**
  - **URL:** `http://localhost:8090/messages`
  - **Method:** POST
  - **Headers:**
    - `userId: 123`
  - **Body:**
    ```json
    {
      "msgContent": "Hello, world!"
    }
    ```
    
#### DELETE /messages/{id}
- This endpoint deletes a message by its ID. Replace {id} with the ID of the message you want to delete.

    ```
    http://localhost:8090/messages/123
    ```

## Contributors
- Jens Nilsson (@jn.jensnilsson@gmail.com)
- August Rydnell (@august.ryd@gmail.com)


    
