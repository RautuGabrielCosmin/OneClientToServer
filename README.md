# Java TCP Socket Example

A simple Java-based TCP socket project demonstrating a bi-directional communication between a server and a console client.

## Description

This repository contains two Java applications:

- **Server**: Listens on port `1234`, accepts client connections, reads incoming messages, echoes a confirmation response (`"Msg Received."`), and shuts down the connection gracefully when it receives the message `"exit"`.
- **Client**: Connects to `localhost` on port `1234`, reads user input from the console, sends messages to the server, prints the server’s responses, and terminates when the user types `"exit"`.

## Features

- Demonstrates basic TCP socket programming in Java
- Clean resource management using `BufferedReader`/`BufferedWriter` and try-finally blocks
- Simple echo protocol with a predefined exit command

## Prerequisites

- Java JDK 8 or higher
- Maven or another build tool (optional)

## Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/java-tcp-socket-example.git
   cd java-tcp-socket-example
   ```

2. **Compile the code**
   ```bash
   javac Server.java Client.java
   ```

3. **Run the server**
   ```bash
   java Server
   ```

4. **In a new terminal, run the client**
   ```bash
   java Client
   ```

5. **Interact via the console**
   - Type messages in the client window and press Enter
   - The server will respond with `Msg Received.`
   - Type `exit` to end the session

## Project Structure

```
├── Server.java   # TCP server implementation
├── Client.java   # TCP client implementation
└── README.md     # Project documentation
```

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

