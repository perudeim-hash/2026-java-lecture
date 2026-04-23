package ch08.enumeration.answer.ex11;

public enum Role {
    ADMIN("관리자", 10),
    MANAGER("매니저", 2),
    GUEST("게스트", 1),
    ;

    private final String title;
    private final int level;

    Role(String title, int level) {
        this.title = title;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public int getLevel() {
        return level;
    }
}
