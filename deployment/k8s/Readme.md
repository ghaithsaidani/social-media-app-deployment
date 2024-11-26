# Kubernetes Deployment for Microservices Social Media Platform

This repository contains Kubernetes Helm charts and operational configurations for deploying a microservices-based social media application. The deployment is designed to be scalable, secure, and automated, leveraging modern DevOps tools for efficient management and monitoring.

---

## 📖 Project Overview

The repository is structured into three main sections: **Base Services**, **Microservices**, and **Tools**. Each section is managed using Helm charts for consistent and repeatable deployments.

![Kubernetes Cluster Architecture](images/Kubernetes%20cluster%20architecture.png)

### 1. **Base Services (charts/base)**

This section includes Helm charts for the foundational services needed to support the application:

- **MySQL Database:** A relational database for persistent data storage.
- **Redis:** In-memory data structure store for caching.
- **Kafka Server:** Message broker for event-driven communication.
- **Zookeeper:** Manages and coordinates distributed systems.

### 2. **Microservices (charts/services)**

This section contains Helm charts for the core microservices of the social media application:

- **Eureka Discovery Service:** Handles service discovery within the microservices architecture.
- **API Gateway:** Centralized entry point for routing API requests to services.
- **User Service:** Manages user profiles and authentication.
- **Connections Service:** Handles social media connections (followers/friends).
- **Post Service:** Manages posts, likes, and comments.
- **Notification Service:** Sends real-time notifications to users.

Each of these services is deployed using Helm charts. **Ingress-NGINX** is configured to manage HTTPS traffic for the **API Gateway** and **Discovery Service**.

### 3. **Tools (charts/tools)**

This section includes Helm charts for deploying Jenkins, which is used for continuous integration and deployment:

- **Jenkins (CI/CD):** Deploys Jenkins using Helm, integrated with Kubernetes for dynamic agent provisioning. A new agent is created for each pipeline execution, and it is deleted afterward.

The **Tools** section inside **charts** only contains the Jenkins chart. However, **additional configuration files** for tools such as ArgoCD, Cert-Manager, Grafana, Prometheus, and Vault are located in the **tools** folder outside of the **charts** folder. These tools are critical for managing the cluster, monitoring, and handling secrets.

---

## 🛠️ Key Features

1. **Microservices Deployment:**
    - Helm charts for individual services (Eureka, API Gateway, User Service, etc.).
    - **Ingress-NGINX** is configured to route traffic to the API Gateway and Discovery Service using HTTPS.

2. **CI/CD with Jenkins:**
    - Dynamic Jenkins agents are created on the Kubernetes cluster for each pipeline execution.
    - Automated build and deployment processes using Jenkins.

3. **Continuous Delivery with ArgoCD:**
    - **ArgoCD** automatically provisions and syncs Kubernetes resources with the repository on each code push.

4. **Secrets Management with Vault:**
    - **Vault** securely manages secrets for Jenkins pipelines and other services.

5. **Monitoring & Observability:**
    - **Prometheus** collects metrics for cluster health and service performance.
    - **Grafana** visualizes monitoring data and enables alerting.

---

## 🚀 Setup Instructions

1. **Kubernetes Cluster:** Ensure a working Kubernetes cluster with sufficient resources.
2. **Helm Charts:** Deploy services using the Helm charts provided in the repository.
3. **Ingress Controller:**
    - Deploy **Ingress-NGINX** as the cluster's ingress controller.
    - Configure ingress rules for **API Gateway** and **Discovery Service**.
4. **Cert-Manager:** Install **cert-manager** to manage SSL certificates for services.
5. **Jenkins:** Deploy Jenkins using the chart in the **charts/tools** directory and configure it with Kubernetes Cloud for dynamic agent creation.
6. **ArgoCD:** Set up **ArgoCD** to automate resource synchronization after each code push.
7. **Vault:** Integrate **HashiCorp Vault** to manage and securely store secrets for Jenkins and other services.
8. **Monitoring:** Deploy **Prometheus** and **Grafana** for cluster monitoring and visualization.

---

## 🔗 Repository Structure

- **`/charts/base`:** Helm charts for base services (MySQL, Redis, Kafka, Zookeeper).
- **`/charts/services`:** Helm charts for the social media microservices (Eureka, API Gateway, User Service, etc.).
- **`/charts/tools`:** Helm charts for Jenkins CI/CD tool.
- **`/tools`:** Configuration files for other tools (ArgoCD, Cert-Manager, Grafana, Prometheus, and Vault). This folder contains the operational configurations to integrate these tools into the Kubernetes cluster.

---

## 📋 Requirements

- **Kubernetes cluster** with Helm installed.
- **kubectl** CLI configured for cluster access.
- **Ingress-NGINX** deployed for ingress management.
- **Jenkins**, **ArgoCD**, **Vault**, **Prometheus**, and **Grafana** installed on the cluster.
- **cert-manager** for managing TLS certificates.

---

## 🖥️ Monitoring & Visualization

- **Prometheus:** Collects metrics from Kubernetes and services.
- **Grafana:** Provides dashboards to visualize Prometheus data and set up alerts.

---

## 🙌 Acknowledgment

This project was developed by me **Ghaith Saidani**.

Let me know if you need anything else!
