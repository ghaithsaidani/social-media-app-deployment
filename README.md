# Microservices Platform Deployment

This repository provides a complete infrastructure and deployment pipeline for a microservices-based platform. The project is built with various components to deploy, manage, and scale microservices on Azure using Kubernetes, Terraform, and Jenkins. It includes secure secret management, continuous integration and deployment (CI/CD), and monitoring tools.

### Clone the Repository

To clone the repository along with all its submodules, run the following command:

```bash
git clone https://github.com/ghaithsaidani/social-media-app-deployment
```
---

## 📖 Project Overview

The repository is organized into several core sections. Each section has its own README file for detailed instructions:

1. **[Terraform Deployment](deployment/terraform):** Infrastructure provisioning for Azure resources using Terraform.
2. **[Kubernetes Deployment](deployment/k8s):** Deployment configurations for microservices in a Kubernetes cluster using Helm charts.
3. **[Microservices:](services)** Includes Dockerized microservices with their own CI/CD pipeline.
   - **[Eureka Discovery Service:](services/discovery-service)** Handles service discovery within the microservices architecture. Registers and tracks available services.
   - **[API Gateway:](services/api-gateway)** Centralized entry point for routing API requests to services.
       - Handles load balancing.
       - Performs authentication and authorization checks.
   - **[User Service:](services/user-service)** Manages user profiles and authentication.
       - User registration and login.
       - Profile management (update, view).
   - **[Connections Service:](services/connections-service)** Handles social media connections (followers/friends).
       - Manages follow requests.
       - Tracks mutual connections.
   - **[Post Service:](services/post-service)** Manages posts, likes, and comments.
       - Creates, updates, and deletes posts.
       - Manages post interactions (like, comment, share).
   - **[Notification Service:](services/notification-service)** Sends real-time notifications to users.
       - Push notifications for new posts or interactions.
       - Email notifications for account activities.
4. **[Resources](resources):** Contains links and websites that were useful in developing this project.

Each section contains detailed setup and configuration instructions to ensure a seamless deployment process.

---

## 📋 Requirements

### Tools and Technologies
- **Azure Subscription:** For resource provisioning and management.
- **Terraform:** For infrastructure provisioning on Azure.
- **Helm:** For Kubernetes deployment management.
- **Kubernetes Cluster (AKS):** For hosting microservices.
- **Jenkins:** For CI/CD pipeline automation.
- **Vault:** For secret management.
- **ArgoCD:** For GitOps-style deployment automation.
- **Prometheus & Grafana:** For cluster monitoring and observability.

### Prerequisites
- **Azure CLI:** For interacting with Azure resources.
- **kubectl:** For managing Kubernetes resources.
- **Helm CLI:** For deploying Helm charts.
- **Vault:** Configured with the required secrets for accessing Azure, Docker, and other services.

---

## 🚀 Setup Instructions

For detailed setup instructions for each part of the project, please refer to the respective README files:

1. **[Terraform Setup](deployment/terraform)**
2. **[Kubernetes Setup](deployment/k8s)**
3. **[CI/CD Pipeline Setup(same for all services the difference is in some vault keys)](services/api-gateway)**
4. **[Resources](resources)**

---

## 🔗 Repository Structure

- **`/deployment/terraform`:** Contains Terraform scripts for provisioning Azure resources.
- **`/deployment/k8s`:** Contains Helm charts and Kubernetes deployment configurations for the platform.
- **`/services`:** Includes microservices code and Jenkins pipeline configurations for deploying applications.
- **`/resources`:** Contains links and websites that were useful in developing this project.

---

## 🙌 Acknowledgment

This project was developed and maintained by **Ghaith Saidani**. Contributions, suggestions, and feedback are welcome!

---

## 📞 Contact

For further inquiries or assistance, feel free to reach out to me via [email](mailto:ghaith.saidani@sesame.com.tn) or [LinkedIn](https://www.linkedin.com/in/ghaithsaidani/).

---

