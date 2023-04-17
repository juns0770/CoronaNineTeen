package kr.jibhyeonjeon.covid19.Emergency.Permission;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class PermissionCall {

    Activity aPermissionCall;
    public static final int PERMISSION_CALL=1001;

    public PermissionCall(Activity activity){
        aPermissionCall = activity;

        int permssionCheck = ContextCompat.checkSelfPermission(aPermissionCall, Manifest.permission.CALL_PHONE);

        if (permssionCheck!= PackageManager.PERMISSION_GRANTED) {

            Toast.makeText(aPermissionCall,"권한 승인이 필요합니다",Toast.LENGTH_LONG).show();

            if (ActivityCompat.shouldShowRequestPermissionRationale(aPermissionCall, Manifest.permission.CALL_PHONE)) {

                Toast.makeText(aPermissionCall,"비상 전화 부분 사용을 위해 전화 권한이 필요합니다.",Toast.LENGTH_LONG).show();
            }

            else {
                ActivityCompat.requestPermissions(aPermissionCall, new String[]{Manifest.permission.CALL_PHONE}, PERMISSION_CALL);

                Toast.makeText(aPermissionCall,"비상 전화 부분 사용을 위해 전화 권한이 필요합니다.",Toast.LENGTH_LONG).show();
            }
        }
    }

    public void onPermissionResult(int requestCode, String permissions[], int[] grantResults){

        switch (requestCode) {
            case PermissionCall.PERMISSION_CALL: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    Toast.makeText(aPermissionCall,"승인이 허가되어 있습니다.",Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(aPermissionCall,"아직 승인받지 않았습니다.",Toast.LENGTH_LONG).show();
                }
                return;
            }

        }

    }

}
