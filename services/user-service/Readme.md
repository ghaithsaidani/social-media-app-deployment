# Azure Microservices Platform Deployment Pipeline

This repository contains a Jenkins pipeline for deploying a microservices-based application on Azure Kubernetes Service (AKS). The pipeline automates the process of building, pushing, and deploying Docker images while ensuring secure secret management and scalable infrastructure.

---

## 📖 Project Overview

The deployment pipeline includes the following stages:

1. **Checkout:** Fetches source code from a private GitLab repository using secure credentials.
2. **Login to Azure:** Authenticates with Azure using a service principal for cloud operations.
3. **Get Latest Image Tag:** Retrieves the latest image tag from Azure Container Registry (ACR) and increments it for the new image.
4. **Build Docker Image:** Builds a Docker image for the application using the updated tag.
5. **Login to ACR:** Authenticates with Azure Container Registry to enable pushing images.
6. **Push Docker Image to ACR:** Pushes the built Docker image to ACR with the new tag.
7. **ArgoCD Deployment:** Deploys the updated image to Azure Kubernetes Service using ArgoCD.

![Pipeline](images/CICD%20Pipeline.png)
---

## 🚀 Features

- **Automated CI/CD Pipeline:**  
  Fully automated process from source code retrieval to production deployment.

- **Secure Secret Management:**  
  Secrets are securely retrieved from Hashicorp Vault for GitLab, Azure, and ArgoCD operations.

- **Dynamic Image Tagging:**  
  Ensures a consistent versioning scheme by automatically incrementing Docker image tags.

- **Scalable and Cloud-Native:**  
  Designed to deploy containerized workloads on Azure Kubernetes Service (AKS).

---

## ⚙️ Requirements

### Tools and Platforms
- **Jenkins:** Configured with a pipeline to execute the CI/CD workflow.
- **Hashicorp Vault:** For secure management of sensitive credentials.
- **Azure CLI:** Installed on the Jenkins agent to perform Azure operations.
- **ArgoCD:** For GitOps-based Kubernetes deployment.

### Prerequisites
1. Azure subscription with permissions to create and manage resources.
2. Access to a Hashicorp Vault server with the following secrets:
    - GitLab repository credentials.
    - Azure service principal details.
    - Azure Container Registry (ACR) credentials.
    - ArgoCD login credentials.

3. A Kubernetes cluster (AKS) and Azure Container Registry (ACR) pre-configured.

---

## 🔑 Secret Paths in Vault

| Path                                          | Secrets Required |
|-----------------------------------------------|------------------|
| `jenkins/pipeline-secrets/common`             | GitLab repository URL, registry URL |
| `jenkins/pipeline-secrets/user-service`       | Image name |
| `jenkins/pipeline-secrets/azure-credentials`  | Azure service principal ID, secret, and tenant ID |
| `jenkins/pipeline-secrets/acr-credentials`    | ACR username and password |
| `jenkins/pipeline-secrets/argocd-credentials` | ArgoCD username and password |
| `jenkins/pipeline-secrets/argocd-server`      | ArgoCD server URL |

---

## 🛠 Pipeline Configuration

### Jenkinsfile

The pipeline is defined in the `Jenkinsfile` and follows these stages:
1. **Checkout:** Retrieves the source code from GitLab.
2. **Login to Azure:** Logs into Azure using a service principal.
3. **Get Latest Image Tag:** Retrieves and increments the latest image tag from ACR.
4. **Build Docker Image:** Builds the Docker image using the new tag.
5. **Login to ACR:** Authenticates with ACR to push images.
6. **Push Docker Image to ACR:** Pushes the new image to ACR.
7. **ArgoCD Deployment:** Deploys the updated application using ArgoCD.

---

## 📋 Usage Instructions

1. **Configure Vault Secrets:**  
   Ensure all required secrets are stored in Vault under the correct paths.

2. **Setup Jenkins Agent:**  
   Ensure the agent is configured with the necessary tools (Docker, Azure CLI, etc.).

3. **Run the Pipeline:**  
   Trigger the pipeline to automate the deployment process.

---

## 🙌 Acknowledgment

While the application code was not developed by me, I was responsible for the deployment phase, including:
- Dockerizing the application.
- Designing and implementing the CI/CD pipeline.
- Managing the infrastructure and automating the deployment process.

