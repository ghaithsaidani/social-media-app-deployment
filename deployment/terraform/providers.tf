terraform {
  required_providers {
    azurerm = {
        source = "hashicorp/azurerm"
        version = "4.10.0"
    }
    /* vault = {
      source = "hashicorp/vault"
      version = "4.5.0"
    } */
  }
}

provider "azurerm" {
  features {}
  subscription_id = var.subscription_id

  /* if you're already deployed for the first time your infrastructure, you need to 
  create a service principal in azure and add those keys in a vault service which 
  will be deployed in your cluster and after that uncomment those 4 lines and the required_provider above and be below
  */
  
  //subscription_id = data.vault_generic_secret.azure.data["subscription_id"]
  //client_id = data.vault_generic_secret.azure.data["client_id"]
  //client_secret = data.vault_generic_secret.azure.data["client_secret"]
  //tenant_id = data.vault_generic_secret.azure.data["tenant_id"]
}

/* provider "vault" {
  address = var.vault_address
  token = var.vault_token
} */