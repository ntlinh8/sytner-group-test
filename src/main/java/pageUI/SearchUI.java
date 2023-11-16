package pageUI;

public class SearchUI {
	public static final String Search_button_DynamicSearchedOptionByLabel = "xpath=//ul[contains(@id, 'search-filters-filter')]//div[text()='%s']/ancestor::li";
	public static final String Search_text_DynamicMatchedProductByLabel = "xpath=//ul[contains(@id, 'search-filters-filter')]//div[text()='%s']/following-sibling::span";
	public static final String Search_text_DynamicSelectedOptionByLabel = "xpath=//ul[@id='search-filters-set-refinements']//span[text()='%s']";
	public static final String Search_text_ShowedProductNumber = "xpath=//h1[@id='search-header-title']/following-sibling::small";
	public static final String Search_button_ClearAll = "xpath=//button[text()='Clear all']";
	public static final String Search_menu_DynamicLeftMenuByLabel = "xpath=//div[@id='search-filters-categories']//button[text()='%s']";
	public static final String Search_button_SortBy = "xpath=//div[contains(text(), 'Sort by')]//input[@id='search-header-sort-by']";
	public static final String Search_option_DynamicSortOptionByLabel = "xpath=//ul[@id='search-header-sort-by-menu']/li[contains(text(), '%s')]";
	public static final String Search_text_AllPrice = "xpath=//section[@id='search-results']//div[contains(@class, 'price')]";
	public static final String Search_text_AllMonthlyPayment = "xpath=//section[@id='search-results']//div[contains(text(), 'Per month')]/..";
}
