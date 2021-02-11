package com.joshhorowitz.chooseyourownadventure;

/*
 File: Choose Your Own Adventure, The Escape
 Author: Joshua Horowitz
Purpose: This form creates the GUI for the user to play the game
 */

public class DisplayAdventure extends javax.swing.JFrame {

    /**
     * Creates new form DisplayAdventure
     */
    String[] genDesc = new String[14]; // General Descriptions array
    String[] butactDesc1 = new String[14]; // Button 1 action descriptions array
    String[] butactDesc2 = new String[14]; // Button 2 action descriptions array
    String[] butactDesc3 = new String[14]; // Button 3 action descriptions array
    String[] dispactResults1 = new String[14]; // Button 1 display action results in genDesc array
    String[] dispactResults2 = new String[14]; // Button 2 display action results in genDesc array
    String[] dispactResults3 = new String[14]; // Button 3 display action results in genDesc array
    int i = 0; // General Descriptions control variable, and page number variable
    int j = 0; // Button 1 action/description array variable
    int k = 0; // Button 2 action/description array variable
    int y = 0; // Button 3 action/description array variable
    int numChances = 5; // Chances control variable for how many lives the user has

    public DisplayAdventure() {
        initComponents();
        actionButton1.setVisible(false);
        actionButton2.setVisible(false);
        actionButton3.setVisible(false);
        tryagainButton.setVisible(false);
        startoverButton.setVisible(false);
        resultLabel.setVisible(false);
        descrLabel.setEditable(false);
        dispactresultsLabel.setEditable(false);
        //Sets the beginning page of the Choose your own adventure game.
        
        //Each index in the arrays represent the page numbers, starting from the beginnning page at 0, and so on until the last page.
        //A page represents what's happening on a certain screen.
        genDesc[0] = "Welcome! This a Choose Your Own Adventure! You are an unknown man, of about a young adult age, and has just regained consciousness and you find yourself in a glass room, with water filling up, you must do something to free yourself and see what happened! Are you ready to begin? Press Start! (Note: Read the lower text area before the top one to better follow the story after you click the first right choice!)";
        genDesc[1] = "As said before, you are trapped in a glass room, with water filling it up, you must do something before you drown! What will you do?";
        genDesc[2] = "The room just filled up with water! If you don't do something now, you'll drown! What will you do?";
        genDesc[3] = "You punched the code in, and the panel slides open. As the room is full at this point, you float to the top and jump out of the box, into an ominous room with a door in front of you. You go up to it. What will you do?";
        genDesc[4] = "You opened the door and went into the hallway, you see a light at the right side and head towards it. In the room, you find someone patiently sitting down, almost as if he was waiting for you. 'Welcome' he says. 'Uh... hello.' you say. 'Do you know where you are, or why you are here?' 'Not really, all I remember was-' 'Shh.. I know. You need to get out of here, this place... is not, its not, it isn't...' He trails off in disturbed thought as he tries to find the right words. 'Well, uh thanks for the warning! But I'm going to go now, I'll leave you to your weird ramblings, bye!' You leave the room as he continued his silent ramblings, but then you hear him call out, 'Do not trust anybody, use yours wits and keep your sanity or else you'll never leave here alive!' You turn back around and notice a man in black standing in front of you, with gun in hand. What do you do?";
        genDesc[5] = "You point the gun at him painfully, and he holds his hands up. 'Talk. Now. Tell me where I am, and why I was brought here' 'That's classified.' Getting annoyed you pushed the gun to his forehead, 'I'll do it' '...Well, if you really insist, let's say your far from home, no family or friend connections, in the middle of nowhere. As for why? Well, I'm not really so sure myself, perhaps you've been selected for something... yes, something... maybe torture... maybe testing... who knows.' After hearing enough you shoot him, with him falling to the floor. You take his clothes off and disguise yourself in them, also taking his wallet, and you decide to keep the gun and leave. After much time you finally found an exit and realize you can go home. But, some other ideas are naggin you, like why were you brought here, or should you go to the police. Well, what should you do?";
        // Linear Story Path General Descriptions of the story stored here

        genDesc[6] = "On the train ride home, you noticed someone staring at you, oddly enough he was in the same suit as the man you killed before. Later, at night while you were asleep, you suddenly wake up to find him choking you. Gasping for air you can only do one thing. What do you do?";
        genDesc[7] = "At the next station, the man was carried off with the authorities, and you arrive home many days later without conflict. However, when you get to your house, and go inside, your house is in shambles. Burglarized, papers everywhere, destroyed furniture, every personal possesion either destroyed or gone. Then you see a note on the wall, and it reads, 'If you are reading this, then your house is no longer suitable to live in, everything's either stolen or destroyed. You have no hope of living here, your family is dead, and so are your friends. A representative will kill you for escaping the secret hold, and for murdering one of our men, and almost convicting another...' You hear a sound in your house, and you realize that you are not alone. You quickly go to your bedroom, grab your shotgun, locked the door and waited in fear. The man from the train walks to the door, harshly knocking against it, 'I know you're in there. Come on out and play!' You realize now that you only have two options. One is ending it all by killing yourself, or the other is fighting for your life. What will you do?";
        genDesc[8] = "As you were about to die, suddenly the man from the train was shot dead, and fell off of you to the side. You looked over and you see the man from the beginning holding a gun. 'Good, got here just in time.' he says. 'Please, I've been almost killed too many times today, tell me what's going on!' The man stared back blankly at you, 'I can't explain it really, but you need to find out for yourself, back at the hold. I have the key that will let you into the master's room of that place. You'll know everything by then, but please, take care of yourself, during and after you go back there. Your family and friends are fine in the FBI containment area, just please go now, before any other murder attempts happen!' He puts the key in your hand, grabs your shotgun and gives it to you, and shoves you off. You see that he already prepared and secured a safe travel back. When you arrived back there you went back inside (you still have your disguise on) and head to the door that corresponds with the key and stare at it... Are you ready for the final scene? If so, then continue.";
        // Branched Story Path General Descriptions of the Go Home story progression here

        genDesc[9] = "You arrive home and immediately went to the police station. You asked the receptionist to see an investigator about your case. And you were lead into a room with a police investigator with a ski mask on. 'Sorry, it's just really cold in here' he says. ' Anyway, please, tell me about your, what did you say it was, a murder and kidnapping of you?' The odd thing was that you didn't say anything about what happened to you, so you got very suspicious and asked, 'How do you know I was almost murdered and kidnapped?' 'Well, uh... it practically says that on your clothing sir, been at this job for 30 years.' Feeling uneasy you decided to leave, he grabs you by the arm and holds a gun up to your head, 'You won't be going anywhere now, cornered like the scared rat you are. You're going to walk out with me with your hands tied behind your back and I'm going to take you back to the secret hold. Act natural, or I'll kill you, don't care if its public, or private.' He takes off his ski mask and you realize he was the man staring at you from the train, and having no other choice you complied with him. Him and you walked out onto the street and walked towards the train station. You saw a busy section of people towards your right when you and him were stopped at a traffic light waiting to cross, taking the chance you ran away from him into the crowd. You were able to escape into the park, hidden behind some rocks. But the next thing you knew, he was right behind you, choking you at gun point, 'You're dead now, you rat.' What do you do?  ";
        genDesc[10] = "'Hey, are you okay?' The man from the beginning says to you. '*gasps* Yes, *gasps* I'm fine *gasps*' '*sigh* This has gone on long enough, you need to go back there and settle this, these murder attempts can not happen anymore. I got you a safe travel back there, just go, take this key, it will let you go into the master room and you'll know everything by then, and hopefully will be safe. Go, now!' He pushes you, while you still are recovering from being strangled on the train station. You arrived safely at the secret hold, went to door that corresponded to the key, and stared blankly at it. Are you ready to continue to the final part? If so, then continue.";
        // Branched Story Path General Descriptions of the Go to Police story progression here

        genDesc[11] = "You went back inside and it seems as if you were walking in circles for hours, no signs of people, and no signs of any open rooms. This keeps going until you found the man you met before in that one mysterious room in the beginning. 'Why hello again!' He says. 'Oh hey, it's you.' 'There's no time to talk, you need to get to the master room of this place quickly!' 'Well, I would like to, except I've been walking around here for hours not finding any room or clue about this place, not even any people!' 'Yes, and that's good. Here, take this key, and go down that hallway.' He points in a direction that you have already been to. 'Find the door that corresponds to this key, then you'll know of why you're here, and you can shut down the place. Go, quickly before they find you!' He pushes you out the door and closes it, confused, you stumbled down the hallway until you came up to a very obvious door that matches the key. You stare blankly at it. Are you ready to continue to the final part? If so, then continue.";
        // Branched Story Path General Description of the Go Inside story progression here
        
        genDesc[12] = "You used the key on the door, and it opened up into an eerie, dark room, with only a chair, and a dim light hanging over it, 'Sit down, Albert.' a booming voice from the shadows said. You sit down in the chair, looking bewildered. 'Do you know, why you are here, Albert Fitzgerald?' After a minute, you realized that's your name. In all of this time you forgot your name, and practically your personal life. How could you forget your name? 'No... no that's why I came here. I was told... that it would be explained...' How could you forget your name, you don't remember the name of your wife, or your children... 'Albert, you were one of our last test subjects, you were being tested in these trials, the ones you took here, and whichever ones you took in your little adventure.' What did your children look like? Did you have a job? How old are you? These questions and more are slowly spinning in your mind as you start to lose your sanity, 'But... trials? For what? And why can't I remember...' 'You are one of our last test subjects, to be turned into a mindless soldier for us, we had to make sure you could handle the job by the murder attempts, and during your blackout, we've been drugging you to completely forget your personal memory. And only now, when your mind is offguard with these questions, does the drugs take the last step in turning you mindless.' His talking becomes muffled as several different questions of your past spin in your head. What was your life like? Did you have any problems? When was your 16th birthday? ...Who are you? 'Yes... fall deep into yourself, until you are no more, Mr. Fitzgerald.' In the midst of all these questions, one single question pops into your head from the last clear memory you had. Who are you? Decide, who you are.";
        genDesc[13] = "'Explain yourself' said the shadow voice. 'Well, it wouldn't have made any sense until now anyway.' You regain your sanity and can think clearly, remembering your past much better. ' My consciousness took form of the man in the beginning, the man who has helped me to get to this point, regardless of the circumstances. This man was the last remaining part of me, and it separated itself and turned into a vivid hallucination to help me out of this mess.' 'You mean to say that you didn't kill my men? Because you certainly did somehow.' said the shadow voice. 'Oh no, I did, but at those times, I thought it was that man who killed them. But it was really me, I was seeing the true me that killed them, the me who protected my mindless body... and now that I've remembered everything... you're not here either.' As soon as you said that, the room turns lighter, revealing a broken down science laboratory, with the shadow voice no where to be found. 'I remember now.. this facility was the placed where I lead research of the mind. In a last ditch attempt to save it from poverty, I decided to have experiments done on myself, and it ended just as badly as was told in the story here. My mind must have recalled it, very vividly, perhaps from those drugs, and also perhaps its because I'm really 80 years old and my mind wasn't what it used to be... Gosh, that must of happened 50 years ago, and yet I find myself here in this broken down facility...why...(he trails off was he continues to wander the halls...) The End (Good End)";
        //Linear Story Path final part General Descriptions
        
        butactDesc1[1] = "Scream and Yell";
        butactDesc1[2] = "Mash buttons on the keypad.";
        butactDesc1[3] = "Try the door knob.";
        butactDesc1[4] = "Try to reason with him.";
        butactDesc1[5] = "Go home";
        // Linear Story Path Buttton 1 action descriptions stored here

        butactDesc1[6] = "Give the death stare into his eyes.";
        butactDesc1[7] = "Choose from the bottom 2 buttons.";
        butactDesc1[8] = "";
        // Branched Story Path Button 1 action descriptions stored here for the Go home story progression

        butactDesc1[9] = "Call out for help.";
        butactDesc1[10] = "";
        // Branched Story Path Button 1 action descriptions stored here for the Go to Police story progression

        butactDesc1[11] = "";
        // Branched Story Path Button 1 action descriptions stored here for the Go Inside story progression
        
        butactDesc1[12] = "...";
        butactDesc1[13] = "";
        // Linear Story Path final part Button 1 action descriptions stored here
        
        butactDesc2[1] = "Look around";
        butactDesc2[2] = "Feel the panel for a weakness";
        butactDesc2[3] = "Peer through the peep hole.";
        butactDesc2[4] = "Drop kick him";
        butactDesc2[5] = "Go to your hometown and get the police.";
        // Linear Story Path Button 2 action descriptions stored here

        butactDesc2[6] = "Shoot him";
        butactDesc2[7] = "Fight for your life.";
        butactDesc2[8] = "Continue to the final part.";
        //Branched Story Path Button 2 action descriptions stored here for the Go Home story progression

        butactDesc2[9] = "Kick him in the shin.";
        butactDesc2[10] = "Continue to the final part.";
        // Branched Story Path Button 2 action descriptions stored here for the Go to Police story progression

        butactDesc2[11] = "Continue to the final part.";
        // Branched Story Path Button 2 action descriptions stored here for the Go Inside story progression
        
        butactDesc2[12] = "The... man from the beginning.";
        butactDesc2[13] = "Finish";
        // Linear Story Path final part Button 2 action descriptions stored here
        
        butactDesc3[1] = "Try to break the glass";
        butactDesc3[2] = "Try to remember a possible code";
        butactDesc3[3] = "Kick the door down.";
        butactDesc3[4] = "Try to take the gun away from him.";
        butactDesc3[5] = "Go back inside";
        // Linear Story Path Button 3 action descriptions stored here

        butactDesc3[6] = "Grab your pilow and knock him out.";
        butactDesc3[7] = "Suicide.";
        butactDesc3[8] = "";
        //Branched Story Path Button 3 action descriptions stored here for the Go Home story progression

        butactDesc3[9] = "Struggle.";
        butactDesc3[10] = "";
        // Branched Story Path Button 3 action descriptions stored here for the Go to Police story progression

        butactDesc3[11] = "";
        // Branched Story Path Button 3 action descriptions stored here for the Go Inside story progression
        
        butactDesc3[12] = "Albert Fitzgerald.";
        butactDesc3[13] = "";
        //Linear Story Path final part Button 3 action descriptions stored here.
        
        dispactResults1[1] = "You screamed and yelled, but it seems that no one could hear you, if anyone was there.";
        dispactResults1[2] = "You frantically mashed the buttons on the keypad during your last few seconds, but all that happened was an annoying rain of error sounds... and you drowned. The End (Bad End)";
        dispactResults1[3] = "You tried the door knob, and it magically opens up, despite your doubts!";
        dispactResults1[4] = "'Don't try anything hasty now, come on, we're both human right? ...Right?' He stands there looking blankly at you.";
        dispactResults1[5] = "Feeling that you had enough madness for one day, you decide to leave. You got your bearings and made the several hour journey home by train from the wads of cash in the wallet. But, this won't be an easy journey...";
        // Linear Story Path Display action button 1 results

        dispactResults1[6] = "You stopped struggling and stared at him as coldly and deathly as possible. Though he was unfazed and you choked to death. At the next station he stuffed your body into his luggage and and walked to who knows where. The End (Bad End)";
        dispactResults1[7] = "Choose: Fight, or die.";
        dispactResults1[8] = "Go on, click continue.";
        // Branched Story Path display button 1 results stored here for the Go Home story progression.

        dispactResults1[9] = "You had enough breath to be able to scream out a few times, but just before you ran out of breath, the man from the train was shot, releasing you and falling to the ground. You looked and saw the man from the beginning standing there with a gun with a blank expression on his face...";
        dispactResults1[10] = "Click continue.";
        // Branched Story Path display button 1 results stored here for the Go to Police story progression.

        dispactResults1[11] = "Click continue.";
        // Branched Story Path display button 1 results stored here for the Go Inside story progression.
        
        dispactResults1[12] = "You couldn't think clearly enough to answer him, and suddenly your mind went blank. You never knew who you are, but you were now a soldier for them. The End. (Bad End)";
        dispactResults1[13] = "";
        // Linear Story Path final part display button 1 results stored here
        
        dispactResults2[1] = "You looked around and notice a locked panel above you, with a keypad to the side of it.";
        dispactResults2[2] = "You felt the panel, but could not find any slight cracks or fractures in the glass. You ended up drowning, but on the bright side you didn't cut your hands on any fragments! The End. (Bad End)";
        dispactResults2[3] = "You peered through the peep hole, but its too dark to tell what is beyond the door.";
        dispactResults2[4] = "You made a swift drop kick, but he dodged even swifter than your kick, crashing against the wall. He comes up behind you as you are unconscious on the floor, and drags you away, never to be seen or heard from again. The End. (Bad End)";
        dispactResults2[5] = "You decide to get back home and contact the police. From the huge wads of cash in the wallet, you were able to secure a safe train trip back home (except from a creepy interaction with a man staring at you on the train), but what will the cops say to this madness...";
        // Linear Story Path Display action button 2 results

        dispactResults2[6] = "You managed to grab your gun and pointed it at him. But you hear the click sound of a gun with no bullets. Mortified, you struggled, but was strangled to death. Your body put into his luggage and he walked away to who knows where. The End. (Bad End)";
        dispactResults2[7] = "You chose to fight for your life. Without thinking, you open the door, yell in his face and tackle him. You tried to knock him out with your shotgun, but he pushed you off on to the floor, the shotgun sliding under the broken dresser. Holding you at gun point, you realize this is the end...";
        dispactResults2[8] = "";
        // Branched Story Path display button 2 results stored here for the Go Home story progression

        dispactResults2[9] = "You kicked him in the shin, but he didn't seem to get hurt by it, and unfortunately he shot you right as you ran out of air. In your last moments of life you see the man get shot by the man from the beginning, and he goes over and starts to cry from looking at your dead body, 'No... was too late.' The End. (Bad End)";
        dispactResults2[10] = "";
        // Branched Story Path display button 2 results stored here for the Go to Police story progression

        dispactResults2[11] = "";
        // Branched Story Path display button 2 results stored here for the Go Inside story progression
        
        dispactResults2[12] = "You said the man on the train... the shadow voice wasn't sure what you meant... but somehow it saved you!";
        dispactResults2[13] = "Congratulations! You finished the game! Did you enjoy the story? More of a deep story than expected huh? That's what I was trying to go for anyway. If you want to try again, hit the start over button! Thanks for playing!";
        // Linear Story Path final part display button 2 results stored here
        
        dispactResults3[1] = "You tried to punch out a glass wall, but cry out in pain and fall to the floor, wishing you hadn't done that.";
        dispactResults3[2] = "You were able to remember a person saying 2567 before you  blacked out. Feeling hopeful you put the code in.";
        dispactResults3[3] = "You take a running start and you smashed your leg into the door, but suprisingly you're able to walk!";
        dispactResults3[4] = "You grabbed his gun, but it wasn't easy. He had a firm hold on it and was punching and kicking you until you would let go, but you managed to slip the gun out of his hands, ignoring the repeated beatings.";
        dispactResults3[5] = "You decided to go back inside, closed and sealed the door. You're bound and determined to find out what's going on, and wouldn't give up until you found out. Even if it means, risking your life.";
        //Linear Story Path display action button 3 results

        dispactResults3[6] = "You grabed your hard as stone pillow and hit him in the face. He falls back, letting you go, and you call the train authorities. They come just in time and hold him while you were getting your breath back and recovering.";
        dispactResults3[7] = "Realizing that you have nothing left to live for, you take your shotgun and shoot yourself. At the last moments of consciousness, you realize that the man from the train was shot dead by someone, you never knew who, but what you did know, was that you heard your wife, daughter, and son walk in to the house. They soon open the door to see you lying there dead. They're all shaken and mortified, 'If only I had come sooner...' said the mysterious man who shot the man from the train. 'No... dad no! No! Nooooooooo!' cried the daughter, weeping at your side while the son stared at your body. The children's lives forever changed for the worst, all because you chose to kill yourself. Hopefully this should teach you a lesson that suicide is never the way to go. The End. (Very Bad End)";
        dispactResults3[8] = "Click continue.";
        //Branched Story Path display button 3 results stored here for the Go Home story progression

        dispactResults3[9] = "You tried to struggle yourself free, but that only made his hold tighter on your throat, until he got too annoyed and shot you. He walked away with your dead body, never to be seen from again. The End. (Bad End)";
        dispactResults3[10] = "Go on, click continue.";
        //Branched Story Path display button 3 results stored here for the Go to Police story progression

        dispactResults3[11] = "Click continue.";
        //Branched Story Path display button 3 results stored here for the Go Inside story progression
        
        dispactResults3[12] = "'Albert Fitzgerald' you said. 'Hahahahaha! You might have been in your past, but not anymore!' the shadow voice boomed. Your mind suddenly goes dark, you were Albert Fitzgerald, but he no longer exists. You are now a mindless soldier forced to work for them. The End. (Bad End)";
        dispactResults3[13] = "";
        
        descrLabel.setText(genDesc[0]); // Sets the beginning text
    }
        /**
         * This method sets up the Game lost display in the GUI, prompting the player to start over, try again, or exit
         * Note: The try again button will be unavailable if at zero lives
         */
    private void loseGame() {
        resultLabel.setText("Failure! You Died!");
        resultLabel.setVisible(true);
        actionButton1.setVisible(false);
        actionButton2.setVisible(false);
        actionButton3.setVisible(false);
        tryagainButton.setVisible(true);
        startoverButton.setVisible(true);    
        if ( numChances == 0) {
            tryagainButton.setVisible(false);
        }
        descrLabel.setText("Would you like to try again? You have " + numChances + " chances left. If your chances are 0, then you must start over.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        startexitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrLabel = new javax.swing.JTextArea();
        actionButton1 = new javax.swing.JButton();
        actionButton2 = new javax.swing.JButton();
        actionButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dispactresultsLabel = new javax.swing.JTextArea();
        resultLabel = new javax.swing.JLabel();
        tryagainButton = new javax.swing.JButton();
        startoverButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(5000, 5000));

        titleLabel.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("The Escape");

        startexitButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        startexitButton.setText("Start!");
        startexitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startexitButtonActionPerformed(evt);
            }
        });

        descrLabel.setColumns(20);
        descrLabel.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        descrLabel.setLineWrap(true);
        descrLabel.setRows(5);
        descrLabel.setText("Welcome! This a Choose Your Own Adventure! You have just regained consciousness and you find yourself in a glass room, with water filling it up, you must do something to free yourself and see what happened! Are you ready to begin? Press Start! \n");
        descrLabel.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descrLabel);

        actionButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        actionButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButton1ActionPerformed(evt);
            }
        });

        actionButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        actionButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButton2ActionPerformed(evt);
            }
        });

        actionButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        actionButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButton3ActionPerformed(evt);
            }
        });

        dispactresultsLabel.setColumns(20);
        dispactresultsLabel.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        dispactresultsLabel.setLineWrap(true);
        dispactresultsLabel.setRows(5);
        dispactresultsLabel.setWrapStyleWord(true);
        jScrollPane2.setViewportView(dispactresultsLabel);

        resultLabel.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 36)); // NOI18N
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLabel.setText("Failure! You Died!");

        tryagainButton.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        tryagainButton.setText("Try Again?");
        tryagainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryagainButtonActionPerformed(evt);
            }
        });

        startoverButton.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        startoverButton.setText("Start Over?");
        startoverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startoverButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tryagainButton, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(142, 142, 142)
                .addComponent(startexitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(173, 173, 173)
                .addComponent(startoverButton, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)))
                .addGap(342, 342, 342))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(actionButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(343, 343, 343))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(actionButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actionButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(342, 342, 342))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(actionButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(actionButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(actionButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(tryagainButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(startoverButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(startexitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startexitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startexitButtonActionPerformed
        if (startexitButton.getText() == "Exit Game") {
            System.exit(0);
        }
        startexitButton.setText("Exit Game"); //This button switches to an exit button after beginning the game
        i++;
        j = i;
        k = i;
        y = i;
        //Sets all action control variables to the constant variable (i)
        descrLabel.setText(genDesc[i]); //Sets the page 1 general description
        actionButton1.setVisible(true);
        actionButton2.setVisible(true);
        actionButton3.setVisible(true);
        //Turns on the action buttons
        actionButton1.setText(butactDesc1[j]);
        actionButton2.setText(butactDesc2[k]);
        actionButton3.setText(butactDesc3[y]);
        //Sets the beginning text of the action buttons
    }//GEN-LAST:event_startexitButtonActionPerformed

    private void actionButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButton1ActionPerformed
        j = i;
        //Sets action button 1 to the constant variable, the page number

        dispactresultsLabel.setText(dispactResults1[j]);
        //Sets the results of the action in the display results text area, regardless if it was the right choice.

        if (i == 3 || i == 5 || i == 9) {
            //Controls the linear progression of the story. (If button 1 was the right choice, then it progresses.
            i++;
            descrLabel.setText(genDesc[i]);
            j = i;
            k = i;
            y = i;
            actionButton1.setText(butactDesc1[j]);
            actionButton2.setText(butactDesc2[k]);
            actionButton3.setText(butactDesc3[y]);
            //Code to progress the story by setting the descriptions. Also, the basic branched story line is included here as well, only for this button though.   
        }
        else if (i == 2 || i == 6 || i == 12) {
            loseGame();
            //Calls the loseGame method if these requirements are met, but not the top requirements
    }//GEN-LAST:event_actionButton1ActionPerformed
    }
    private void actionButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButton2ActionPerformed
        if (i == 8 || i == 10 || i == 11) {
            i = 11;
        }
        //Sets the control variable to the start of the final story part
        
        k = i;
        //Sets action button 2 to the constant variable, the page number

        dispactresultsLabel.setText(dispactResults2[k]);
        //Sets the results of the action in the display results text area, regardless if it was the right choice.
        
        if (i == 5) {
            i = 8;
        }
         //Sets the control variable to the start of the Go to Police story progression
        
        if (i == 1 || i == 7 || i == 8 || i == 11 || i == 12) {
            //Controls the progression of the story, (If button 2 was the right choice, then it progresses.) 
            i++;
            descrLabel.setText(genDesc[i]);
            j = i;
            k = i;
            y = i;
            actionButton1.setText(butactDesc1[j]);
            actionButton2.setText(butactDesc2[k]);
            actionButton3.setText(butactDesc3[y]);
            //Code to progress the story by setting the descriptions
        }
        else if (i == 2 || i == 4 || i == 6 || i == 9) {
            loseGame();
        }
        //Calls the loseGame method if these requirements are met, but not the top requirements
        if (i == 13) {
            resultLabel.setText("Congratulations! You won!");
            resultLabel.setVisible(true);
            actionButton1.setVisible(false);
            actionButton2.setVisible(false);
            actionButton3.setVisible(false);
            startoverButton.setVisible(true);
        }
        //Sets the Winning/Congratulations screen.
    }//GEN-LAST:event_actionButton2ActionPerformed

    private void actionButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButton3ActionPerformed

        y = i;
        //Sets action button 3 to the constant variable, the page number

        dispactresultsLabel.setText(dispactResults3[y]);
        //Sets the results of the action in the display results text area, regardless if it was the right choice.
        
        if (i == 10) {
            i++;
        } 
        //Ensures that the third button at the end of the sceond branched story part does not jump into the third story line, instead of displaying a message.
        
        if (i == 5) {
            i = 10;
        }
        // Sets the control variable to the start of the Go Inside story progression
         
        if (i == 2 || i == 4 || i == 6 || i == 10) {
            //Controls the progression of the story, (If button 3 was the right choice, then it progresses.) 
            i++;
            descrLabel.setText(genDesc[i]);
            j = i;
            k = i;
            y = i;
            actionButton1.setText(butactDesc1[j]);
            actionButton2.setText(butactDesc2[k]);
            actionButton3.setText(butactDesc3[y]);
            //Code to progress the story by setting the descriptions
        }
        else if (i == 7 || i == 9 || i == 12) {
            loseGame();
        }
        //Calls the loseGame method if these requirements are met, but not the top requirements
    }//GEN-LAST:event_actionButton3ActionPerformed

    private void tryagainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryagainButtonActionPerformed

        if ( numChances <= 5 && numChances >= 0) {
        numChances--;
        descrLabel.setVisible(true);
        resultLabel.setVisible(false);
        tryagainButton.setVisible(false);
        startoverButton.setVisible(false);
        actionButton1.setVisible(true);
        actionButton2.setVisible(true);
        actionButton3.setVisible(true);
        descrLabel.setText(genDesc[i]);
        dispactresultsLabel.setText("");
        }
        //Decreases the chances by one every time the try again button is pressed, sets the page back to before the player died.
    }//GEN-LAST:event_tryagainButtonActionPerformed

    private void startoverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startoverButtonActionPerformed
        i = 0;
        j = 0;
        k = 0;
        y = 0;
        numChances = 5;
        tryagainButton.setVisible(false);
        startoverButton.setVisible(false);
        resultLabel.setVisible(false);
        startexitButton.setText("Start!");
        descrLabel.setText(genDesc[i]);
        dispactresultsLabel.setText("");
        //Sets all variables to 0, sets the game back to the start page
    }//GEN-LAST:event_startoverButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisplayAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayAdventure().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionButton1;
    private javax.swing.JButton actionButton2;
    private javax.swing.JButton actionButton3;
    private javax.swing.JTextArea descrLabel;
    private javax.swing.JTextArea dispactresultsLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton startexitButton;
    private javax.swing.JButton startoverButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton tryagainButton;
    // End of variables declaration//GEN-END:variables
}
