# What is this solution for?

Please feel free to update this page.

Lorem ipsum dolor sit amet consectetur adipisicing elit. Eius inventore eveniet necessitatibus? Consectetur harum debitis animi aliquam officia nulla repellat odit, aspernatur vel dolore expedita, accusantium suscipit vitae ab a.

Lorem ipsum dolor sit amet consectetur adipisicing elit. Eius inventore eveniet necessitatibus? Consectetur harum debitis animi aliquam officia nulla repellat odit, aspernatur vel dolore expedita, accusantium suscipit vitae ab a.

![Sequence Diagram](../assets/security-context.svg)

<!--
@startuml /../assets/security-context
!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Context.puml
!define FONTAWESOME https://raw.githubusercontent.com/tupadr3/plantuml-icon-font-sprites/master/font-awesome-5

LAYOUT_WITH_LEGEND()

Person(employee, "Employee", "CBI employee")
Person_Ext(partner, "Partner ", "CBI Partner")

System(solutionApp, "Solution", "Business unit related solution")

System_Ext(platformApp, "CBI Service Mesh", "Runtime platform")
System_Ext(accessManager, "Access Manager", "Authentication Provider")
System_Ext(directory, "User Pool", "Corporate Directory")
System_Ext(integration, "Intergration layer", "Anypoint platform")
System_Ext(saas, "SaaS", "Shopify, Hubspot, Docusign")
System_Ext(opCommercial, "On Premise", "SAP, Oracle Finance,Salesforce",)


Rel(employee, solutionApp, "Authenticates", "https")
Rel(partner, solutionApp, "Authenticates", "https")

Rel(solutionApp, platformApp, "Delegates Authentication", "")
Rel_R(solutionApp, integration, "Calls to external APIs", "SAML/OpenID token")

Rel(integration, saas, "Call", "SAML/OpenID")
Rel(integration, opCommercial, "Call", "SAML/OpenID")

Rel(accessManager, directory, "Verify the employee/partner subscritption to the corporate directory", "LDAP")

Rel(platformApp, accessManager, "Triggers the authenticatication flow, and adds the valid assertions to the request", "SAML, OpenID")

Rel(opCommercial, accessManager, "Centralized authentication", "")
Rel(saas, accessManager, "Centralized authentication", "")

@enduml
-->