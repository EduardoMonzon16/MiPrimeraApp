package pe.edu.ulima.pm.miprimeraapp.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.view.accessibility.AccessibilityNodeInfo
import org.w3c.dom.Attr

class ULFaceView : View {
    private var paint : Paint = Paint()
    private var nSize : Float = 0f
    private var nWidth : Float = 0f
    private var nHeight : Float = 0f

    /*constructor(context : Context) : super(context){
        //Crear una nueva instancia solo para este codigo
    }*/

    constructor(context: Context, attra: AttributeSet) : super(context, attra) {
        //Crear una nueva instancia a partir de XMI

    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        nWidth = View.MeasureSpec.getSize(widthMeasureSpec).toFloat()
        nHeight = View.MeasureSpec.getSize(heightMeasureSpec).toFloat()

        nSize = Math.min(nWidth, nHeight)

        setMeasuredDimension(nWidth.toInt(), nHeight.toInt())
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        drawCara(canvas!!)
        drawOjos(canvas!!)
    }

    private fun drawCara(canvas: Canvas) {
        paint.color = Color.YELLOW
        paint.style = Paint.Style.FILL_AND_STROKE

        canvas.drawCircle(nWidth/2f, nHeight/2f, nSize/2f, paint)
    }

    private fun drawOjos(canvas: Canvas) {
        paint.color = Color.BLACK
        paint.style = Paint.Style.FILL

        val eyeWidth = nSize/6f
        canvas.drawCircle(nSize/4f, nSize/4f,  eyeWidth/2f, paint)
    }
}