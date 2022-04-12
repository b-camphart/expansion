package steps

import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class Steps {

    @Given("a flat, {int} by {int} map")
    fun a_flat_by_map(int1: Int, int2: Int) {
        throw PendingException()
    }

    @Given("a unit is in the center of the map")
    fun a_unit_is_in_the_center_of_the_map() {
        throw PendingException()
    }

    @Given("the unit has a maximum allowed distance of {int}")
    fun the_unit_has_a_maximum_allowed_distance_of(int1: Int?) {
        throw PendingException()
    }

    @When("the player moves the unit a distance of {double} at {int} degrees")
    fun the_player_moves_the_unit_a_distance_of_at_degrees(double1: Double?, int1: Int?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Then("a {string} message should be given")
    fun a_message_should_be_given(string: String?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Then("the unit should not have been moved from the center of the map")
    fun the_unit_should_not_have_been_moved_from_the_center_of_the_map() {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Then("the unit should be a distance of {int} at {int} degrees from the center of the map")
    fun the_unit_should_be_a_distance_of_at_degrees_from_the_center_of_the_map(int1: Int?, int2: Int?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @When("the player moves the unit a distance of {int} at negative {int} degrees")
    fun the_player_moves_the_unit_a_distance_of_at_negative_degrees(int1: Int?, int2: Int?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Given("the unit has a diameter of {int}")
    fun the_unit_has_a_diameter_of(int1: Int?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Given("another friendly unit is a distance of {int} at {int} degrees from the center of the map")
    fun another_friendly_unit_is_a_distance_of_at_degrees_from_the_center_of_the_map(int1: Int?, int2: Int?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Given("the other friendly unit has a diameter of {int}")
    fun the_other_friendly_unit_has_a_diameter_of(int1: Int?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Then("the unit should be a distance of {double} at {int} degrees from the center of the map")
    fun the_unit_should_be_a_distance_of_at_degrees_from_the_center_of_the_map(double1: Double?, int1: Int?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

}