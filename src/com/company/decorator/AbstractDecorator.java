package com.company.decorator;

/**
 * Abstract decorator
 */
public class AbstractDecorator extends Component{
    private Component component;

    public AbstractDecorator() {
    }

    public AbstractDecorator(Component component) {
        this.component = component;
    }
    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    void doJob() {
        if(component!=null) {
            component.doJob();
        }
    }
}
