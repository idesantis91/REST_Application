# REST_Application
Submission for Code Challenge at LifeWay

# Build/Run Instructions
- Clone GitHub Repo
- In CMD, CD into target folder (cd REST_Application/rest-service/target/)
- Run java -jar rest-service-0.0.1-SNAPSHOT.jar
- Open localhost:8080/count?id=(enter ID here)&content=(Enter Message here)

## Requirements
- [x] Create a REST service with a single endpoint that accepts a json message with two fields.."id" and "message". (example: { "id": "123", "message": "hello world" })
- [x] The endpoint should return a json document with a single field "count" that contains the total number of words contained in all the messages received to that point.
- [x] For example, if the first message contains 3 words it would respond with count = 3. If the next message contains 5 words it would respond with count = 8.
- [x] The service should ignore messages with duplicate ids. (i.e. ids that have already been processed)
- [x] Use Java or Kotlin
- [x] Use Spring Boot
- [x] Use the database of your choice to track id’s and counts.
- [x] Upload all code to a public github repo with a readme that explains how to build and run the project.
