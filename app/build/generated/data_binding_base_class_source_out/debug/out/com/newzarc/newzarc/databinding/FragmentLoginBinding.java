// Generated by view binder compiler. Do not edit!
package com.newzarc.newzarc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.newzarc.newzarc.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText emailInputButton;

  @NonNull
  public final TextView emailLoginLabel;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final Button loginGoogleButton;

  @NonNull
  public final TextView loginIn;

  @NonNull
  public final TextView or;

  @NonNull
  public final TextView passwordLabel;

  @NonNull
  public final EditText passwordLogin;

  @NonNull
  public final TextView registerPageButton;

  @NonNull
  public final TextView subLoginIn;

  private FragmentLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText emailInputButton, @NonNull TextView emailLoginLabel,
      @NonNull Button loginButton, @NonNull Button loginGoogleButton, @NonNull TextView loginIn,
      @NonNull TextView or, @NonNull TextView passwordLabel, @NonNull EditText passwordLogin,
      @NonNull TextView registerPageButton, @NonNull TextView subLoginIn) {
    this.rootView = rootView;
    this.emailInputButton = emailInputButton;
    this.emailLoginLabel = emailLoginLabel;
    this.loginButton = loginButton;
    this.loginGoogleButton = loginGoogleButton;
    this.loginIn = loginIn;
    this.or = or;
    this.passwordLabel = passwordLabel;
    this.passwordLogin = passwordLogin;
    this.registerPageButton = registerPageButton;
    this.subLoginIn = subLoginIn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emailInputButton;
      EditText emailInputButton = ViewBindings.findChildViewById(rootView, id);
      if (emailInputButton == null) {
        break missingId;
      }

      id = R.id.emailLoginLabel;
      TextView emailLoginLabel = ViewBindings.findChildViewById(rootView, id);
      if (emailLoginLabel == null) {
        break missingId;
      }

      id = R.id.loginButton;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.loginGoogleButton;
      Button loginGoogleButton = ViewBindings.findChildViewById(rootView, id);
      if (loginGoogleButton == null) {
        break missingId;
      }

      id = R.id.loginIn;
      TextView loginIn = ViewBindings.findChildViewById(rootView, id);
      if (loginIn == null) {
        break missingId;
      }

      id = R.id.or;
      TextView or = ViewBindings.findChildViewById(rootView, id);
      if (or == null) {
        break missingId;
      }

      id = R.id.passwordLabel;
      TextView passwordLabel = ViewBindings.findChildViewById(rootView, id);
      if (passwordLabel == null) {
        break missingId;
      }

      id = R.id.passwordLogin;
      EditText passwordLogin = ViewBindings.findChildViewById(rootView, id);
      if (passwordLogin == null) {
        break missingId;
      }

      id = R.id.registerPageButton;
      TextView registerPageButton = ViewBindings.findChildViewById(rootView, id);
      if (registerPageButton == null) {
        break missingId;
      }

      id = R.id.subLoginIn;
      TextView subLoginIn = ViewBindings.findChildViewById(rootView, id);
      if (subLoginIn == null) {
        break missingId;
      }

      return new FragmentLoginBinding((ConstraintLayout) rootView, emailInputButton,
          emailLoginLabel, loginButton, loginGoogleButton, loginIn, or, passwordLabel,
          passwordLogin, registerPageButton, subLoginIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
