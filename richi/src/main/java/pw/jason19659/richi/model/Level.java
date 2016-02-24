package pw.jason19659.richi.model;

public class Level {
    private Integer id;

    private String name;

    private Integer maxPoint;

    private Integer initPoint;

    private Integer levelRank;

    private Integer firstPoint;

    private Integer secondPoint;

    private Integer thirdPoint;

    private Integer forthPoint;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(Integer maxPoint) {
        this.maxPoint = maxPoint;
    }

    public Integer getInitPoint() {
        return initPoint;
    }

    public void setInitPoint(Integer initPoint) {
        this.initPoint = initPoint;
    }

    public Integer getLevelRank() {
        return levelRank;
    }

    public void setLevelRank(Integer levelRank) {
        this.levelRank = levelRank;
    }

    public Integer getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Integer firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Integer getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Integer secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Integer getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(Integer thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    public Integer getForthPoint() {
        return forthPoint;
    }

    public void setForthPoint(Integer forthPoint) {
        this.forthPoint = forthPoint;
    }
}