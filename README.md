# Elastic Community Train Manager API Application

Welcome to the Elastic Community Train Manager API project!

## Usage

The video below shows how the setup convert json to sql and build and serve application.

![Setup and run server](./static/video/setup.gif)

And the next video show how the api works
![Test an application](./static/video/solutions.gif)

## Getting Started

Here's how to get started:

### Prerequisites

To run this application project, you need to have the following installed in your device

- [Docker](https://docs.docker.com/get-docker/)
- Java 8 or above

### Installing

Follow the steps below to run the application locally

1. First, unzip the Elastic-Team-Java-PostgreSQL-Challenge-Train Manager-NelsonFrank.zip

2. Change directory and activate virtual enviroment

```bash
cd ./Elastic-Team-Java-PostgreSQL-Challenge-Train Manager-NelsonFrank/code/code/code

```

3. Then build and start your application

```bash
docker compose up --build
```

> Note: If you have older docker version, then use `docker-compose up --build`

## Deployment

Follow the following steps to deploy the django app

1.  Choose a server provider, such as AWS, Google Cloud, or DigitalOcean. For example, you could use AWS EC2 to set up a virtual server.

2.  Set up the server by installing the necessary software, such as Docker, Java and a web server like Apache or Nginx. In our case we use nginx as web server

    ```bash
    # Install java
    sudo apt install default-jre nginx

    ```

    To install Docker in you server,
    Follow the instruction [here](https://docs.docker.com/desktop/install/linux-install/).

3.  Clone the project on server

    ```bash
    git clone git@github.com:nelsonfrank/Elastic-Community-Train-Manager-Api-Application
    ```

4.  Serve your application in production.

    ```bash
    cd Elastic-Community-Train-Manager-Api-Application/code/code

    # Serve your application
    docker compose up --build -d
    ```

5.  Accessing the train manager api application
    In your browser open the server followed by port number. In our case it 8080
    visit `http://<server-ip>:8080/api/trains` in your browser/postman client to see list of all trains.

6.  Hurray, You successfully deploy your application.

## Built With

- Java 8
- Spring Boot 2
- PostgreSQL
- Maven
- Docker

## Authors

- **Nelson Frank** -
  [nelsonfrank](https://github.com/nelsonfrank)

## License

This project is licensed under the [MIT License](https://choosealicense.com/licenses/mit/) - see the [MIT](https://choosealicense.com/licenses/mit/) License for
details

## Acknowledgments

- [Official Spring documentation](https://spring.io/quickstart)
- [Baeldung](https://www.baeldung.com/exception-handling-for-rest-with-spring)
- [Spring boot tutorial by Amigoscode](https://youtu.be/9SGDpanrc8U)
