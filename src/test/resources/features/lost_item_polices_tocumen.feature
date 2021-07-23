Feature:
  As a user to the Tocumen Airport
  I want to access the polices general information
  To verify the Lost and Found Polices document

  @Scenario1
  Scenario: Verify the Lost and Found Polices document - Successfull
    Given that user wants to use the Tocumen Airport Page
    When He wants download the Lost and Found Polices document
    Then He should see the document politicas-objetos-extraviados
