
# i2i Academy - In-Memory Data Store with Redis

This repository contains the source code and infrastructure configuration for the Redis local caching assignment as part of the i2i Academy curriculum.

## Project Objective
The goal of this project is to implement and demonstrate high-volume caching operations using an In-Memory Data Store. The architecture leverages Docker to deploy standalone database instances and uses a custom Java client to benchmark data integrity and throughput.

## Tech Stack
* **Language:** Java
* **Infrastructure:** Docker, Docker Compose
* **Database & GUI:** Redis (latest), RedisInsight (latest)

## Key Features Implemented
1. **Containerized Architecture:** Orchestrated a fully isolated environment using Docker Compose to spin up Redis Server and RedisInsight simultaneously.
2. **High-Volume Data Insertion:** Engineered an optimized loop sequence to instantiate and push exactly **10,000 unique Person entities** formatted as JSON data into the memory pool.
3. **Cache Validation:** Implemented an asynchronous verification sequence that queries, fetches, and prints structured entity payloads directly from the live cache cluster.

## How to Run
1. Start the infrastructure components via Docker:
   ```bash
   docker compose up -d

```

2. Compile and execute the native Java framework:
```bash
javac Main.java && java Main

```

