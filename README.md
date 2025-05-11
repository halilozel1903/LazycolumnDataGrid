# 🎶 Compose Artist Table

A **Jetpack Compose** sample app that renders a list of artists in a neat, table-style layout. Each row shows age, name, country, and music genre, complete with row & column dividers and dynamic text wrapping. Perfect for demos, tutorials, or as a starting point for your own Compose data grids! ✨

---

## 🚀 Features

- **Table-style LazyColumn** with horizontal & vertical dividers  
- **Multi-line support**: long names and genres wrap into new lines  
- **Dynamic data**: load from a simple `PersonRepository`  
- **Material 3** typography & theming  
- **Previewable UI** with `@Preview` functions  

---

## 📱 App Preview

<p align="center">
  <img src="screen-1.png" alt="Main list" width="45%" />
  <img src="screen-2.png" alt="Wrapped text" width="45%" />
</p>


---

## 🔧 Getting Started

1. **Clone** the repo:  
   ```bash
   git clone https://github.com/halilozel1903/LazycolumnDataGrid.git
   cd compose-artist-list
   ```
2. **Open** in Android Studio Arctic Fox or newer.  
3. **Run** on emulator or device:  
   - API 21+  
   - Material 3 theme enabled  
4. **Explore** `PersonRepository.kt` and `CustomItem.kt` for how the data & UI are wired up! 🧐

---

## 📂 Project Structure

```
├── app/
│   ├── src/main/java/…/MainActivity.kt      # Hosts PersonList()
│   ├── src/main/java/…/CustomItem.kt        # TableCell + Divider composables
│   └── src/main/java/…/PersonRepository.kt  # Sample data source
├── docs/
│   └── screenshots/                         # Paste your screenshots here
└── README.md                                # ← you are here!
```

---

## 🤝 Contributing

1. Fork it! 🍴  
2. Create your feature branch: `git checkout -b feature/YourFeature`  
3. Commit your changes: `git commit -m 'Add awesome feature'`  
4. Push to the branch: `git push origin feature/YourFeature`  
5. Open a Pull Request 📝  

---

## Donation 💸

If this project help 💁 you to develop, you can give me a cup of coffee. ☕

[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://www.buymeacoffee.com/halilozel1903)

## 📜 License
```
MIT License

Copyright (c) 2025 Halil OZEL

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
