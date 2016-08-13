package com.company.decorator;

/**
 * Created by fagim on 13.08.16.
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
