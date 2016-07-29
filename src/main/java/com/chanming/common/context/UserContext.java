package com.chanming.common.context;

import lombok.Getter;
import lombok.Setter;

import javax.websocket.Session;


/**
 * Created by chanming on 16/7/29.
 */

public class UserContext {
    private Session session;

    public UserContext(Session session){
        this.session = session;
    }

    /**
     * ��Ϸ״̬
     */
    private @Getter @Setter int gameStatus;
    public interface GAME_STATUS {int PENDING  = 0; int READY = 1; int RUNNING = 2;}

    /**
     * �Ƿ�׼�����
     */
    public boolean isReady(){
        return gameStatus == GAME_STATUS.READY;
    }
}
