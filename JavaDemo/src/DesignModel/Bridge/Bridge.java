package DesignModel.Bridge;

import DesignModel.Proxy.Source;

public abstract class Bridge {
    private SourceAble source;
    public void setSource(SourceAble source){
        this.source = source;
    }

    public SourceAble getSource(){
        return source;
    }

    public void method(){
        source.method();
    }
}
