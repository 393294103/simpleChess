package com.chanming.common.context.chess;

import lombok.Getter;
import lombok.Setter;

/**
 * ������
 * Created by chanming on 16/7/27.
 */

public class ChessBoard {
    public class Point{
        private @Getter @Setter int x;
        private @Getter @Setter int y;
    }
    private @Getter @Setter Integer grids[][];
}
