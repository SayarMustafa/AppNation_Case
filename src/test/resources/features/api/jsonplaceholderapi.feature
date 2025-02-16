Feature:Jsonplaceholder Api feature

  Scenario: Successful user get request
    When a user make a get request to "/posts/2"
    Then the response status should be 200
    Then the response should contain email, name and body fields

  Scenario: Successful user post request
    When a user make a post request to "/posts" with params "foo" as title, "bar" as body, 1 as userId
    Then the response status should be 201
    Then the response should contain title as "foo", body as "bar", userId as 1
    Then the response should contain id field