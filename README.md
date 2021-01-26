# java-spring-boot-rest-uploader-2

Code challenge for myself to create RESTful server for uploading/downloading JSON documents

Usage:

1. `gradlew bootRun`
1. In any REST/HTTP client, POST a JSON body string like `{"contents": "my document contents"}` to `localhost:8081/documents`
1. GET from `localhost:8081/documents` for full list, or `localhost:8081/documents/<id>` for specific documents
