import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
// import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { MdButtonModule, MdCheckboxModule, MdTabsModule } from '@angular/material';
import { MaterialModule } from '@angular/material';
import { routing } from './app.routing'
import { DataTableModule } from "angular2-datatable";
import { DataFilterPipe } from './components/book-list/data-filter.pipe';

import 'hammerjs';

//components
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { MyAccountComponent } from './components/my-account/my-account.component';
import { MyProfileComponent } from './components/my-profile/my-profile.component';
import { OrderComponent } from './components/order/order.component';
import { BookDetailComponent } from './components/book-detail/book-detail.component';
import { OrderSummaryComponent } from './components/order-summary/order-summary.component';

//services
import { LoginService } from './services/login.service';
import { UserService } from './services/user.service';
import { BookService } from './services/book.service';
import { PaymentService } from './services/payment.service';
import { ShippingService } from './services/shipping.service';
import { OrderService } from './services/order.service';
import { ShoppingCartComponent } from './components/shopping-cart/shopping-cart.component';
import { BookListComponent } from './components/book-list/book-list.component';
import { CartService } from './services/cart.service';
import { CheckoutService } from './services/checkout.service';




@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavBarComponent,
    MyAccountComponent,
    MyProfileComponent,
    OrderComponent,
    ShoppingCartComponent,
    BookListComponent,
    DataFilterPipe,
    BookDetailComponent,
    OrderSummaryComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    BrowserAnimationsModule,
    // NoopAnimationsModule,
    MdButtonModule, 
    MdCheckboxModule,
    MdTabsModule,
    routing,
    DataTableModule,
  ],
  providers: [
    LoginService,
    UserService,
    BookService,
    PaymentService,
    ShippingService,
    OrderService,
    CartService,
    CheckoutService,
    ],
  bootstrap: [AppComponent]
})
export class AppModule { }
