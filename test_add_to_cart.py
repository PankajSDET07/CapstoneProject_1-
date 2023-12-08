
from base_test import setup
from pages.home_page import HomePage
from pages.search_results_page import SearchResultsPage
from pages.product_page import ProductPage

class TestAddToCart:

    @pytest.mark.usefixtures("setup")
    def test_add_to_cart(self):
        home_page = HomePage(self.driver)
        assert home_page.is_flipkart_present(), "Flipkart not found on the page."

        home_page.search_product("Macbook air m2")

        search_results_page = SearchResultsPage(self.driver)
        search_results_page.click_on_first_result()

        product_page = ProductPage(self.driver)
        product_page.add_to_cart()

        # Verify item added to cart (you might need to implement this based on the website)
        # You can use assertions or log statements for verification
