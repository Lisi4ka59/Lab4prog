public abstract class AbstractDanger implements Danger, Describable  {
    protected String title;

    public void setTitle(String title)
    {
        if (title!=null)
            this.title = title;
        else
            throw new IllegalArgumentException();
    }
    public String getTitle()
    {
        return title;
    }

    @Override
    public String toString(){
        return title;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof AbstractDanger))
            return false;

        AbstractDanger p = (AbstractDanger) o;

        return title.equals(p.title);
    }

    @Override
    public int hashCode () {
        return title.hashCode();
    }

}
