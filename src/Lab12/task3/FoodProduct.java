package Lab12.task3;

    private String expirationDate;

        super(name, price, id);
        this.expirationDate = expirationDate;
    }

    public String getDescription () {
    }

    public void applyDiscount (double percent) {
        price = price - (price * percent / 100);
    }
}
