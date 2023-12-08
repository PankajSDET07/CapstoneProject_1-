
class SearchResultsPage:
    def __init__(self, driver):
        self.driver = driver

    def click_on_first_result(self):
        self.driver.find_element_by_css_selector("div._1AtVbE").click()