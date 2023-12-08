
class HomePage:
    def __init__(self, driver):
        self.driver = driver

    def is_flipkart_present(self):
        return self.driver.find_element_by_xpath("//a[text()='Flipkart']").is_displayed()

    def search_product(self, product):
        self.driver.find_element_by_name("q").send_keys(product)
        self.driver.find_element_by_css_selector("button[type='submit']").click()




