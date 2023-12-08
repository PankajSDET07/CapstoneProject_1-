
class ProductPage:
    def __init__(self, driver):
        self.driver = driver

    def add_to_cart(self):
        self.driver.find_element_by_xpath("//button[text()='ADD TO CART']").click()