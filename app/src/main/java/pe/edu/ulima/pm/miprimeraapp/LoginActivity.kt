package pe.edu.ulima.pm.miprimeraapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    private var mtxtIngresar : Button? = null
    private var meteUsuarioCorreo : EditText? = null
    private var meteUsuarioPassword : EditText? = null
    private var mTviMensaje : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mtxtIngresar= findViewById(R.id.txtIngresar)
        meteUsuarioCorreo = findViewById(R.id.eteUsuarioCorreo)
        meteUsuarioPassword = findViewById(R.id.eteUsuarioPassword)
        mTviMensaje = findViewById(R.id.mTviMensaje)

        mtxtIngresar!!.setOnClickListener { v : View ->
            Log.i("LoginActivity", "Hizo click")
            val correo : String = meteUsuarioCorreo!!.text.toString()
            val password : String = meteUsuarioPassword!!.text.toString()

            if(correo == "pa@ulima.edu.pe")
            {
                mTviMensaje!!.text = "Login Correcto"
            }
            else
            {
                mTviMensaje!!.text = "Login Inorrecto"
            }
        }

    }
}