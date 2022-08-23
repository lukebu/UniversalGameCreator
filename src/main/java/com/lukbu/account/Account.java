package com.lukbu.account;
import java.util.List;

public class Account {

    //Standard parameters
    private final long accountId;
    private final String accountAlias;
    private final String accountPassword;
    private final int defaultMaxCharacterValue = 5;

    //Game connected parameters
    private List<Character> characters;
    private int characterMaxValue;

    public Account(long accountId, String accountAlias, String accountPassword) {
        this.accountId = accountId;
        this.accountAlias = accountAlias;
        this.accountPassword = accountPassword;
    }

    public long getAccountId() {
        return accountId;
    }

    public String getAccountAlias() {
        return accountAlias;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public int getCharacterMaxValue() {
        return characterMaxValue;
    }

}
