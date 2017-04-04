package com.cs.alf.patterns.creational.builder;

/**
 * Created by mikhail_alferov on 04.04.2017.
 */
public class House {
    private String base;
    private String walls;
    private String roof;
    private boolean isComplited;

    private House() {
    }

    public static Builder newBuilder() {
        return new House().new Builder();
    }

    @Override
    public String toString() {
        return "House{" +
                "base='" + base + '\'' +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", isComplited=" + isComplited +
                '}';
    }

    public class Builder {

        private Builder() {
        }

        public Builder putBase(String base) {
            House.this.base = base;
            return this;
        }

        public Builder putWalls(String walls) {
            House.this.walls = walls;
            return this;
        }

        public Builder putRoof(String roof) {
            House.this.roof = roof;
            return this;
        }

        public House build() {
            isComplited = true;
            return House.this;
        }

    }
}
