

# Terraform Deployment for Azure Microservices Platform

This repository contains Terraform scripts for deploying an Azure-based infrastructure for a microservices platform. The infrastructure is modular and designed to ensure scalability, security, and efficient resource management.

---

## 📖 Project Overview

The deployment consists of the following core modules:

1. **Resource Group (rg):** The container for all Azure resources.
2. **Network:** Configures virtual networks and subnets for secure communication.
3. **Azure Kubernetes Service (aks):** A Kubernetes cluster with a master node and two worker nodes for running containerized workloads.
4. **Azure Container Registry (acr):** A private container registry for storing and managing Docker images.
5. **Blob Storage:** A storage solution for hosting the Terraform state file.


![Microsoft Azure Architecture](images/Microsoft%20Azure%20architecture.png)
---

## ⚠️ First-Time Setup Instructions

If this is your first time using the repository, follow these steps:

1. **Create `terraform.tfvars`:**
   - Populate this file with the required variable values as defined in `variables.tf`. At a minimum, include `subscription_id`.

2. **Activate Local Backend:**
   - Temporarily enable local backend settings in `backend.tf`, as Blob Storage resources are not yet available to host the state file.

3. **Initialize and Apply Resources:**
   - Use the local backend to provision the necessary Azure resources, including Blob Storage.

4. **Switch to Remote Backend:**
   - Once Blob Storage is created:
      - Update `backend.tf` to configure the Azure backend block.
      - Create a `backend.tfvars` file with the necessary backend configuration.
      - Reinitialize Terraform with the remote backend settings.

5. **Configure Azure Service Principal and Vault:**
   - After initial provisioning:
      - Set up an Azure Service Principal for secure authentication.
      - Configure a Hashicorp Vault service to store and manage secrets.
      - Update `providers.tf` to activate commented lines for using Vault secrets.

6. **Reapply Configuration:**
   - Reconfigure and apply your infrastructure to fully integrate the Vault service and shared secret management.

---

## ✅ After Setup

Congratulations! Your infrastructure is now provisioned, and the Terraform state file is securely stored in Azure Blob Storage. Access can be granted to other users for collaborative infrastructure management.

---

## ✨ Features

- **Infrastructure Modules:** Modular design for resource group, network, AKS, ACR, and Blob Storage.
- **Secure State Management:** State file hosted in Blob Storage for easy sharing and collaboration.
- **Vault Integration:** Secrets are securely stored and accessed using Hashicorp Vault.
- **Scalable and Reusable:** Designed to accommodate growing workloads with minimal reconfiguration.

---

## 📋 Requirements

- **Terraform CLI:** Version 1.0 or later.
- **Azure CLI:** Installed and authenticated.
- **Azure Subscription ID:** Required for initial setup.
- **Administrative Access:** Necessary for provisioning resources.

---

## 🙌 Acknowledgment

This project was developed by me **Ghaith Saidani**.

Let me know if you need anything else!
