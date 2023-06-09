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

public final class FragmentRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText conPasswordInput;

  @NonNull
  public final TextView conPasswordLabel;

  @NonNull
  public final TextView createSubTitle;

  @NonNull
  public final TextView editNewsHeading;

  @NonNull
  public final EditText emailInput;

  @NonNull
  public final TextView emailLabel;

  @NonNull
  public final TextView loginLink;

  @NonNull
  public final EditText nameInput;

  @NonNull
  public final TextView newsHeadingLabel;

  @NonNull
  public final TextView orSignup;

  @NonNull
  public final EditText passwordInputSignup;

  @NonNull
  public final TextView passwordLabelsignup;

  @NonNull
  public final Button signupGoogle;

  @NonNull
  public final Button signupbutton;

  private FragmentRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText conPasswordInput, @NonNull TextView conPasswordLabel,
      @NonNull TextView createSubTitle, @NonNull TextView editNewsHeading,
      @NonNull EditText emailInput, @NonNull TextView emailLabel, @NonNull TextView loginLink,
      @NonNull EditText nameInput, @NonNull TextView newsHeadingLabel, @NonNull TextView orSignup,
      @NonNull EditText passwordInputSignup, @NonNull TextView passwordLabelsignup,
      @NonNull Button signupGoogle, @NonNull Button signupbutton) {
    this.rootView = rootView;
    this.conPasswordInput = conPasswordInput;
    this.conPasswordLabel = conPasswordLabel;
    this.createSubTitle = createSubTitle;
    this.editNewsHeading = editNewsHeading;
    this.emailInput = emailInput;
    this.emailLabel = emailLabel;
    this.loginLink = loginLink;
    this.nameInput = nameInput;
    this.newsHeadingLabel = newsHeadingLabel;
    this.orSignup = orSignup;
    this.passwordInputSignup = passwordInputSignup;
    this.passwordLabelsignup = passwordLabelsignup;
    this.signupGoogle = signupGoogle;
    this.signupbutton = signupbutton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.conPasswordInput;
      EditText conPasswordInput = ViewBindings.findChildViewById(rootView, id);
      if (conPasswordInput == null) {
        break missingId;
      }

      id = R.id.conPasswordLabel;
      TextView conPasswordLabel = ViewBindings.findChildViewById(rootView, id);
      if (conPasswordLabel == null) {
        break missingId;
      }

      id = R.id.create_sub_title;
      TextView createSubTitle = ViewBindings.findChildViewById(rootView, id);
      if (createSubTitle == null) {
        break missingId;
      }

      id = R.id.edit_news_heading;
      TextView editNewsHeading = ViewBindings.findChildViewById(rootView, id);
      if (editNewsHeading == null) {
        break missingId;
      }

      id = R.id.emailInput;
      EditText emailInput = ViewBindings.findChildViewById(rootView, id);
      if (emailInput == null) {
        break missingId;
      }

      id = R.id.emailLabel;
      TextView emailLabel = ViewBindings.findChildViewById(rootView, id);
      if (emailLabel == null) {
        break missingId;
      }

      id = R.id.loginLink;
      TextView loginLink = ViewBindings.findChildViewById(rootView, id);
      if (loginLink == null) {
        break missingId;
      }

      id = R.id.nameInput;
      EditText nameInput = ViewBindings.findChildViewById(rootView, id);
      if (nameInput == null) {
        break missingId;
      }

      id = R.id.news_heading_label;
      TextView newsHeadingLabel = ViewBindings.findChildViewById(rootView, id);
      if (newsHeadingLabel == null) {
        break missingId;
      }

      id = R.id.orSignup;
      TextView orSignup = ViewBindings.findChildViewById(rootView, id);
      if (orSignup == null) {
        break missingId;
      }

      id = R.id.passwordInputSignup;
      EditText passwordInputSignup = ViewBindings.findChildViewById(rootView, id);
      if (passwordInputSignup == null) {
        break missingId;
      }

      id = R.id.passwordLabelsignup;
      TextView passwordLabelsignup = ViewBindings.findChildViewById(rootView, id);
      if (passwordLabelsignup == null) {
        break missingId;
      }

      id = R.id.signupGoogle;
      Button signupGoogle = ViewBindings.findChildViewById(rootView, id);
      if (signupGoogle == null) {
        break missingId;
      }

      id = R.id.signupbutton;
      Button signupbutton = ViewBindings.findChildViewById(rootView, id);
      if (signupbutton == null) {
        break missingId;
      }

      return new FragmentRegisterBinding((ConstraintLayout) rootView, conPasswordInput,
          conPasswordLabel, createSubTitle, editNewsHeading, emailInput, emailLabel, loginLink,
          nameInput, newsHeadingLabel, orSignup, passwordInputSignup, passwordLabelsignup,
          signupGoogle, signupbutton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
