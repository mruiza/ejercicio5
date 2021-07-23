Feature:
  As a client to the Banistmo group
  I want to access the general information of tariff
  To download the manual of Deposit Account Fees

  @Download
  Scenario: Verify download manual of Deposit Account Fees - Successfull
    Given that the supplier wants to use the Banistmo Page
    When He download the document of Deposit Account Fees
    Then He should see the PDF Tarifas de cuentas de Depósitos