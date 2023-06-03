package ru.stqa.pft.mantis.appmanager;

import org.openqa.selenium.By;

public class ChangePasswordHelper extends HelperBase{
    public ChangePasswordHelper(ApplicationManager app) {
        super(app);
    }

    private String appName = app.getProperty("app.name");

    public void loginAsAdmin() {
        wd.get(app.getProperty("web.baseUrl") + "/login_page.php");
        type(By.name("username"), "administrator");
        click(By.xpath("//input[@value='Вход']"));
        type(By.name("password"), "root");
        click(By.xpath("//input[@value='Вход']"));
    }

    public void goToManagePage() {
        click(By.id("menu-toggler"));
        click(By.xpath("//div[@id='sidebar']/ul/li[6]/a/span"));
    }

    public void goToManageUsers() {
        click(By.linkText("Управление пользователями"));
    }

    private void goToUser() {
        click(By.xpath("//tr[2]/td/a"));
    }

    public void userPage() {
        loginAsAdmin();
        goToManagePage();
        goToManageUsers();
        goToUser();
    }

    public void resetPassword() {
        click(By.cssSelector("input[value='Сбросить пароль']"));
    }

    public String getUserName() {
        String user = wd.findElement(By.name("username")).getAttribute("value");
        return user;
    }

    public String getEmail() {
        String email = wd.findElement(By.name("email")).getAttribute("value");
        return email;
    }
}
