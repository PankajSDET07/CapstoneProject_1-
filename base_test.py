
import pytest
from selenium import webdriver

@pytest.fixture(scope="class")
def setup(request):
    # Initialize WebDriver (update the path to your chromedriver executable)
    driver = webdriver.Chrome(executable_path="C:/Users/Pankaj/D/chromedriver.exe")
    driver.maximize_window()
    driver.get("https://www.flipkart.com/")
    request.cls.driver = driver
    yield
    # Quit WebDriver
    driver.quit()
