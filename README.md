# 🎮 RPG Arena 2D

> Um jogo 2D arcade desenvolvido em JavaFX onde sobrevivência é a única regra.

Você controla um herói dentro de uma arena infinita.  
Colete energia, cresça, fique mais poderoso…  
Mas cuidado: tocar as bordas significa **fim de jogo**.

---

## 🕹️ Gameplay

- 🎮 Movimentação fluida com teclado (WASD ou setas)
- 🔵 Colete orbes de energia espalhadas pela arena
- 📈 Cada orbe aumenta o tamanho do herói
- ⚠️ Encostar na borda da tela = Game Over
- 🚀 Sistema de loop contínuo usando `AnimationTimer`

---

## 🧱 Tecnologias Utilizadas

- ☕ Java 17  
- 🎨 JavaFX 21  
- 📦 Maven  
- 🔧 Git  

---

## 🗂️ Estrutura do Projeto

```
RPG-Java
│
├── personagens
│   ├── Heroi.java
│   └── Personagem.java
│
├── objetos
│   └── Bolinha.java
│
├── ui
│   ├── GameCanvas.java
│   └── GameController.java
│
└── Main2D.java
```

---

## ▶️ Como Rodar o Jogo

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/seu-usuario/RPG-Java.git
cd RPG-Java
```

### 2️⃣ Execute

```bash
mvn clean javafx:run
```

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido para:

- Praticar arquitetura orientada a objetos
- Implementar lógica de colisão
- Criar um game loop real
- Trabalhar renderização gráfica com JavaFX
- Evoluir fundamentos sólidos em Java

---

## 🚀 Roadmap Futuro

- [ ] Sistema de pontuação
- [ ] Sons e efeitos
- [ ] Menu inicial
- [ ] Sistema de fases
- [ ] Inimigos com IA
- [ ] HUD com score em tempo real

---

## 👨‍💻 Desenvolvedor

Arthur  
Estudante de Engenharia da Computação  
Focado em desenvolvimento Java, backend e arquitetura de software.

---

⭐ Se você curtiu o projeto, deixe uma estrela no repositório!
