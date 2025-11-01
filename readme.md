# 💹 TradeWithAI — AI-Powered Crypto Trading

An intelligent crypto trading and management platform built using **Spring Boot**, **React**, and **Tailwind CSS** — integrating **Gemini API** and **CoinGecko API** for real-time market data.  
It provides users with a seamless experience to **buy, sell, track, and manage cryptocurrencies** securely.


---

## 🚀 Comprehensive Feature Set

### 🤖 AI Chat Bot
- Get instant answers to crypto-related queries.
- Integrated with **Gemini API** and **CoinGecko API** for **real-time market insights**.
- Supports queries like *current price, market cap, and trends*.

### 💱 Buy & Sell Crypto
- Smooth and secure transactions for multiple cryptocurrencies.
- Intuitive interface designed for both beginners and advanced traders.

### 📊 Portfolio Management
- Monitor your investment portfolio.
- Track performance metrics and analyze profit/loss in real time.

---

## 🔐 Advanced Wallet Functionality

- **Wallet-to-Wallet Transfer:** Transfer crypto securely between wallets.
- **Withdrawal to Bank:** Directly withdraw wallet balance to your linked bank account.
- **Add Balance:** Top up your wallet balance easily via Razorpay or Stripe.

---

## 📜 Transaction History

- **Withdrawal History:** View complete records of past withdrawals.
- **Wallet History:** Track all wallet transactions with timestamps and statuses.
- **Search Coin:** Quickly find any cryptocurrency and view real-time stats from integrated APIs.

---

## 🛡️ Robust Authentication & Security

- **User Login & Register:** Secure user authentication and session management.
- **Two-Factor Authentication (2FA):** Adds an extra layer of security for user accounts.
- **Forgot Password:** Simple password recovery mechanism via email (powered by Java Mail Sender).

---

## ⚙️ Cutting-Edge Technology Stack

### 🖥️ Backend
- **Spring Boot** — RESTful API framework
- **MySQL Database** — Persistent data storage
- **Spring Security** — Authentication & authorization
- **Java Mail Sender** — Email verification and password recovery

### 💻 Frontend
- **React.js** — Modern component-based UI
- **Tailwind CSS** — Utility-first styling
- **Redux** — Global state management
- **Axios** — API integration
- **React Router DOM** — Client-side routing
- **shadcn/ui** — Beautiful pre-built UI components

### 💳 Payment Gateways
- **Razorpay** — INR-based payments
- **Stripe** — Global credit/debit card support

### 🌐 External APIs
- **Gemini API** — Crypto market data
- **CoinGecko API** — Real-time coin prices, volume, and charts

---

## 🧠 Architecture Overview


<!-- ## Er Diagram

```
+---------------------+           +-----------------+
|       Users         |<--------->|    Wallets      |
|---------------------|           +-----------------+
| id                  |               ^            
| fullName            |               |
| email               |               |         
| ...                 |               |
+---------------------+               |
                                      |
+--------------------+            +-----------------+
|      Assets        |<---------->| WalletTransactions |
|--------------------|            +-----------------+
| id                 |
| quantity           |
| buy_price          |<---------->+-----------------+
| coin_id            |            |  Coins         |
| user_id            |            +-----------------+
+--------------------+            | id              |
                                  | symbol          |
+--------------------+            | ...             |
| Withdrawals        |<---------->+-----------------+
|--------------------|
| id                 |
| status             |
| amount             |
| user_id            |
| date               |
+--------------------+

+--------------------+
| Watchlists         |
|--------------------+
| id                 |
| user_id            |
+--------------------+
          |
          |
          v
+--------------------+
| Watchlist_Coins    |
|--------------------+
| watchlist_id       |
| coin_id            |
+--------------------+

+---------------------+           +---------------------+
|   VerificationCodes |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| otp                 |
| user_id             |
| email               |
| mobile              |
| verification_type   |
+---------------------+

+---------------------+           +---------------------+
|  TradingHistories   |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| selling_price       |
| buying_price        |
| coin_id             |
| user_id             |
+---------------------+

+---------------------+           +---------------------+
|    PaymentOrders    |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| amount              |
| status              |
| payment_method      |
| user_id             |
+---------------------+

+---------------------+           +---------------------+
|   PaymentDetails    |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| account_number      |
| account_holder_name |
| ifsc                |
| bank_name           |
| user_id             |
+---------------------+

+---------------------+           +---------------------+
|        Orders       |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| user_id             |
| order_type          |
| price               |
| timestamp           |
| status              |
| order_item_id       |
+---------------------+
          |
          |
          v
+---------------------+           +---------------------+
|      OrderItems     |<--------->|        Coins        |
|---------------------|           +---------------------+
| id                  |
| quantity            |
| coin_id             |
| buy_price           |
| sell_price          |
| order_id            |
+---------------------+

+---------------------+             +---------------------+
|    Notifications    | <---------> |        Users        |
|---------------------|             +---------------------+
| id                  |
| from_user_id        |
| to_user_id          |
| amount              |
| message             |
+---------------------+

+---------------------+           
|   MarketChartData   |
|---------------------|
| id                  |
| timestamp           |
| price               |
+---------------------+

+---------------------+           +---------------------+
| ForgotPasswordTokens|<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| user_id             |
| otp                 |
| verification_type   |
| send_to             |
+---------------------+

```

# Database Tables

## Users Table

| Field                   | Type    |
|-------------------------|---------|
| id                      | bigint  |
| fullName                | varchar |
| email                   | varchar |
| mobile                  | varchar |
| password                | varchar |
| status                  | varchar |
| isVerified              | boolean |
| twoFactorAuth_enabled   | boolean |
| twoFactorAuth_sendTo    | varchar |
| picture                 | varchar |
| role                    | varchar |

## Coins Table

| Field                   | Type    |
|-------------------------|---------|
| id                      | varchar |
| symbol                  | varchar |
| name                    | varchar |
| image                   | varchar |
| current_price           | double  |
| market_cap              | bigint  |
| market_cap_rank         | int     |
| fully_diluted_valuation | bigint  |
| total_volume            | bigint  |
| high_24h                | double  |
| low_24h                 | double  |
| price_change_24h        | double  |
| price_change_percentage_24h | double  |
| market_cap_change_24h   | bigint  |
| market_cap_change_percentage_24h | double  |
| circulating_supply      | bigint  |
| total_supply            | bigint  |
| max_supply              | bigint  |
| ath                     | double  |
| ath_change_percentage   | double  |
| ath_date                | datetime|
| atl                     | double  |
| atl_change_percentage   | double  |
| atl_date                | datetime|
| roi                     | varchar |
| last_updated            | datetime|

## Assets Table

| Field     | Type    |
|-----------|---------|
| id        | bigint  |
| quantity  | double  |
| buy_price | double  |
| coin_id   | varchar |
| user_id   | bigint  |

## Withdrawals Table

| Field  | Type    |
|--------|---------|
| id     | bigint  |
| status | varchar |
| amount | bigint  |
| user_id| bigint  |
| date   | datetime|

## Watchlists Table

| Field   | Type    |
|---------|---------|
| id      | bigint  |
| user_id | bigint  |

## Watchlist_Coins Table

| Field         | Type    |
|---------------|---------|
| watchlist_id  | bigint  |
| coin_id       | varchar |

## WalletTransactions Table

| Field       | Type    |
|-------------|---------|
| id          | bigint  |
| wallet_id   | bigint  |
| type        | varchar |
| date        | datetime|
| transfer_id | varchar |
| purpose     | varchar |
| amount      | bigint  |

## Wallets Table

| Field   | Type      |
|---------|-----------|
| id      | bigint    |
| user_id | bigint    |
| balance | decimal   |

## VerificationCodes Table

| Field             | Type    |
|-------------------|---------|
| id                | bigint  |
| otp               | varchar |
| user_id           | bigint  |
| email             | varchar |
| mobile            | varchar |
| verification_type | varchar |

## TradingHistories Table

| Field         | Type    |
|---------------|---------|
| id            | bigint  |
| selling_price | double  |
| buying_price  | double  |
| coin_id       | varchar |
| user_id       | bigint  |

## PaymentOrders Table

| Field         | Type    |
|---------------|---------|
| id            | bigint  |
| amount        | bigint  |
| status        | varchar |
| payment_method| varchar |
| user_id       | bigint  |

## PaymentDetails Table

| Field               | Type    |
|---------------------|---------|
| id                  | bigint  |
| account_number      | varchar |
| account_holder_name | varchar |
| ifsc                | varchar |
| bank_name           | varchar |
| user_id             | bigint  |

## Orders Table

| Field        | Type      |
|--------------|-----------|
| id           | bigint    |
| user_id      | bigint    |
| order_type   | varchar   |
| price        | decimal   |
| timestamp    | datetime  |
| status       | varchar   |
| order_item_id| bigint    |

## OrderItems Table

| Field        | Type    |
|--------------|---------|
| id           | bigint  |
| quantity     | double  |
| coin_id      | varchar |
| buy_price    | double  |
| sell_price   | double  |
| order_id     | bigint  |

## Notifications Table

| Field        | Type    |
|--------------|---------|
| id           | bigint  |
| from_user_id | bigint  |
| to_user_id   | bigint  |
| amount       | bigint  |
| message      | varchar |

## MarketChartData Table

| Field        | Type    |
|--------------|---------|
| id           | bigint  |
| timestamp    | datetime|
| price        | double  |

## ForgotPasswordTokens Table

| Field             | Type    |
|-------------------|---------|
| id                | varchar |
| user_id           | bigint  |
| otp               | varchar |
| verification_type | varchar |
| send_to           | varchar | -->


